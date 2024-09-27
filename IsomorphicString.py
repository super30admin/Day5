
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        '''
        Isomorphic string(Bijection) - One to many mapping not allowed
                            Many to one mapping not allowed
                            a is mapped to i
                            i is mapped to k - is correct -->1
                            
                            a is mapped to i
                            a is mapped to k - Not allowed -->2
                            
                            a is mapped to i
                            k is mapped to i - Not allowed-->3
                            
        We will take 2 dictionary(Hashmap in java). 
        smap - To check mapping of characters from s to t
        tmap - To check mapping of characters from t to s
        
        Time Complexity - O(N)
        Space Complexity - O(1) Since dictionary will have either 26 or 52 characters
        
        ''' 
        
        #base case
        if s==None or t==None:
            return False
        
        # If length unequal--> return False
        if len(s)!=len(t):
            return False
        # We are making 2 dictionary to store maping from both side in order to verify above mentioned conditions
        smap={}  # To store mapping from s to t
        tmap={}  # To store mapping from t to s
        
        for i in range(len(s)):# Iterating through the length of s we can also take t as legth for both is same
            if s[i] in smap:  # If s[i] present in smap
                if t[i]!=smap[s[i]]: #To check 2nd and 3rd condition
                    return False
            else:
                smap[s[i]]=t[i] # Else add the key to smap with value equal to the corresponding value at t
                
            if t[i] in tmap: #Similar for t
                if s[i]!=tmap[t[i]]: 
                    return False
            else:
                tmap[t[i]]=s[i]
                
        return True #No letter in s and t voilating above rule, therefore returning True
                
                
        
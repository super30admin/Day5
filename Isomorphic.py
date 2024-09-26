"""
Intuition: 

Method 1:Use 2 hashmaps. Check association for s to t and t to s. 
#####################################################################
Method 1: Using custom hashmaps
Time Complexity : O(N), where N = length of s or t
Space Complexity : 2*O(26) = O(1)
#####################################################################
Method 2: Using python dictionary as hashmaps
Time Complexity : O(W), where W = number of words
Space Complexity : 2*O(26) = O(1)
#####################################################################
Method 2: Using a hashmap and a hashset
Time Complexity : O(W), where W = number of words
Space Complexity : O(26) = O(1)
#####################################################################
"""
######################
#Custom hashmap.
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        if len(s) != len(t):
            return False
        
        hash_S_To_T = [None] * 100
        hash_T_To_S = [None] * 100
        for index in range(len(s)):
            charOne = s[index]
            charTwo = t[index]
                
            if hash_S_To_T[ord(charOne) - ord(' ')] == None:
                hash_S_To_T[ord(charOne) - ord(' ')] = charTwo

            if hash_S_To_T[ord(charOne) - ord(' ')] != charTwo:
                return False
            
            if hash_T_To_S[ord(charTwo) - ord(' ')] == None:
                hash_T_To_S[ord(charTwo) - ord(' ')] = charOne

            if hash_T_To_S[ord(charTwo) - ord(' ')] != charOne:
                return False
            
        return True


#############################
#Using {} as hashmap
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        if len(s) != len(t):
            return False
        
        hash_S_To_T = {}
        hash_T_To_S = {}
        for index in range(len(s)):
            charOne = s[index]
            charTwo = t[index]
            
            if charOne not in hash_S_To_T:
                hash_S_To_T[charOne] = charTwo

            if hash_S_To_T[charOne] != charTwo:
                return False
            
            if charTwo not in hash_T_To_S:
                hash_T_To_S[charTwo] = charOne

            if hash_T_To_S[charTwo] != charOne:
                return False
            
        return True

#############################
#Using a hashmap and hashset
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        if len(s) != len(t):
            return False
        
        hash_S_To_T = {}
        hash_T_To_S = set()
        for index in range(len(s)):
            charOne = s[index]
            charTwo = t[index]
            
            if charOne not in hash_S_To_T:
                if charTwo in hash_T_To_S:
                    return False
                else:
                    hash_T_To_S.add(charTwo)
                hash_S_To_T[charOne] = charTwo
            else:
                if charTwo != hash_S_To_T[charOne]:
                    return False
            
        return True
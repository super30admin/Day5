class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        #uneven list
        if len(s) != len(t):
            return False
        
        s1 = {}
        t1 = {}
        
        #strings are equal length
        for char in range(0,len(s)):
            val_s = s[char]
            val_t = t[char]
            
   #         print(val_s,val_t)
            
            #if element is present in s:
            if (val_s in s1):
    #            print("1")
                #if present, but mapped to a different element
                if s1[val_s] != val_t:
    #                print("2")
                    return False
            #if element is not present in s:    
            else:
                s1[val_s]=val_t
                
            #if element is present in t:
            if (val_t in t1):
     #           print("3")
                #if present, but mapped to a different element
                if t1[val_t] != val_s:
      #              print("4")
                    return False
            #if element is not present in s:    
            else:
                t1[val_t]=val_s
            
        
        #if does not fail anywhere, return true
        return True            
                
#Time Complexity - should be O(1) as we are using two dictionary (hashmap), could be O(n) since the for loop s traversing all the elements
#Spoce - O(1)
        
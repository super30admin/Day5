"""
Array Implementation 

Time Complexity : O(n)
Space Complexity : O(1)
    
"""

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        hash_s = [None]*100
        hash_t = [None]*100
        factor = ord("a")
       
        for i in range(len(s)):
            
            if hash_s[ord(s[i]) - factor] == None:
                hash_s[ord(s[i]) - factor] = t[i]
            else:
                if hash_s[ord(s[i]) - factor] != t[i]:
                    return False 
            
            if hash_t[ord(t[i]) - factor] == None:
                hash_t[ord(t[i]) - factor] = s[i]
            else:
                if hash_t[ord(t[i]) - factor] != s[i]:
                    return False 
                
        return True 
                
            
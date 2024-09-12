class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        d1 = {}
        d2 = {}
        for i in range(len(s)):
            
            val1 = s[i]
            val2 = t[i]
            if ((val1 in d1 and d1[val1] != val2) or (val2 in d2 and d2[val2]!=val1)):
                return False
            
            d1[val1] = val2
            d2[val2] = val1
            

        return True
                
                
        
        
                
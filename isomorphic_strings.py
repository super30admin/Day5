# Sc : O(n) ,n - length of string
# TC : O(n)

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        map1 = dict()
        map2 = dict()
        
        if len(s)!= len(t):
            return False
        
        for i in range(len(s)):
            if s[i] not in map1:
                map1[s[i]] = t[i]
                if t[i] not in map2:
                    map2[t[i]] = s[i]
                else:
                    if map2[t[i]] != s[i]:
                        return False
            else:
                if map1[s[i]] != t[i]:
                    return False
                
        return True        
                    
            
        
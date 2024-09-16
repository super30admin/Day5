# Time complexity -> O(N)
# Space complexity -> O(1)
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
    
        if len(s) != len(t):
            return False
        
        sMap = {}
        tMap = set()
        
        for i in range(len(s)):
            if s[i] not in sMap:                
                if t[i] in tMap:
                    return False
                sMap[s[i]] = t[i]
                tMap.add(t[i])
            else:
                if sMap[s[i]] != t[i]:
                    return False
                
        return True
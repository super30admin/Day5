#Time complexity : O(N)
#Space complexity : O(N)

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sMap = {}
        tSet = set()
        
        if len(s) != len(t):
            return False
        
        for i in range(len(s)):
            if s[i] in sMap:
                if sMap[s[i]] != t[i]:
                    return False
            else:
                if t[i] in tSet:
                    return False
                sMap[s[i]] = t[i]
                tSet.add(t[i])
                
        return True

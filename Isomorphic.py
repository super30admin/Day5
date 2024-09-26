"""
time complexity: O(n)
space complexity: O(n)
"""
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sMap = {}
        tMap = {}
        
        for i in range(0,len(s)):
            if s[i] not in sMap:
                sMap[s[i]] = t[i]
            elif(sMap[s[i]]!=t[i]):
                return False
        for i in range(0,len(t)):
            if t[i] not in tMap:
                tMap[t[i]] = s[i]
            elif(tMap[t[i]]!=s[i]):
                return False
        return True
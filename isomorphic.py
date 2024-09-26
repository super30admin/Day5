"""
TC:O(n)
SC:O(1)
"""
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        map1={}
        map2={}
        for i in range(len(s)):
            if s[i] not in map1.keys():
                map1[s[i]]=t[i]
            else:
                if map1[s[i]]!=t[i]:
                    return False

            if t[i] not in map2.keys():
                map2[t[i]]=s[i]
            else:
                if map2[t[i]]!=s[i]:
                    return False

        return True

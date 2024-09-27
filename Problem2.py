# Time Complexity: O(n)
# Space Complexity: O(1)

class Solution:

    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False
        smap = {}
        tmap = {}
        for i in range(len(s)):
            if s[i] not in smap.keys():
                smap[s[i]] = t[i]
            else:
                if smap[s[i]]!=t[i]:
                    return False
            
            if t[i] not in tmap.keys():
                tmap[t[i]] = s[i]
            else:
                if tmap[t[i]]!=s[i]:
                    return False
        return True

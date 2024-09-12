# Time Complexity: O(n) where n is number of letters in pattern
# Space Complexity: O(n)
# Ran on Leetcode: Yes

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        smap = {}
        tmap = {}
        for i in range(len(s)):
            schar = s[i]
            tchar = t[i]
            if smap.get(schar):
                if smap[schar] != tchar:
                    return False
            else:
                smap[schar] = tchar
            if tmap.get(tchar):
                if tmap[tchar] != schar:
                    return False
            else:
                tmap[tchar] = schar
        return True
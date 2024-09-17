"""
Time Complexity:    O(n)
Space Complexity:   O(n)
YES, The code successfully ran on Leetcode

Approach - My approach is pretty straight forward, I am using hashmaps to store
two way key to confirm the isomorphism
"""
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t) or s is None or t is None:
            return False
        if len(s) == 1:
            return True
        smap, tmap = dict(), dict()
        for i in range(len(s)):
            schar = s[i]
            tchar = t[i]
            if (schar in smap and smap[schar]!=tchar):
                return False
            if (tchar in tmap and tmap[tchar]!=schar):
                return False
            smap[schar] = tchar
            tmap[tchar] = schar
        return True


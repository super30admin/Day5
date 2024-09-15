# Time Complexity : N : number of characters O(N)
# Space Complexity : O(C) , C: constant number of ASCII chars
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        smap = {}
        tmap = {}
        for i in range(len(s)):

            if s[i] in smap:
                if smap[s[i]] != t[i]:
                    return False
            else:
                smap[s[i]] = t[i]

            if t[i] in tmap:
                if tmap[t[i]] != s[i]:
                    return False
            else:
                tmap[t[i]] = s[i]
        return True

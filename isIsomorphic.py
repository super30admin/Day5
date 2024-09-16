# Time complexity: O(n) ; n = length of s or t
# Space complexity: O(1) ; only 26 lowercase alphabets to store, so O(1)
# Approach: Two hashmaps for s and t; sMap stores s -> t mapping, and tMap stores t -> s mapping. If a mapping already
# exists and doesn't match the corresponding character, return false, do this for both dictionaries. 
# Otherwise both strings are Isomorphic.

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        sMap = {}
        tMap = {}
        for i in range(len(s)):
            if s[i] in sMap.keys():
                if sMap[s[i]] != t[i]:
                    return False
            else:
                sMap[s[i]] = t[i]
            if t[i] in tMap.keys():
                if tMap[t[i]] != s[i]:
                    return False
            else:
                tMap[t[i]] = s[i]
        return True
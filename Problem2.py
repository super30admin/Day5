"""Isomorphic Strings
Time Complexity : O(n)
Space Complexity: O(n) but n here is 256 so  constant time O(1)"""

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False
        dict_s = dict()
        dict_t = dict()
        for i in range(0,len(s)):
            if s[i] not in dict_s:
                dict_s[s[i]] = t[i]
            else:
                if dict_s[s[i]] != t[i]:
                    return False
            if t[i] not in dict_t:
                dict_t[t[i]] = s[i]
            else:
                if dict_t[t[i]] != s[i]:
                    return False
        return True
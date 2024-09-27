# Did this code successfully run on Leetcode: Yes
# Time Complexity: O(n)
# Space Complexity: O(1)
# Logic: create 2 dict & create key-value of s in 1 & reverse i.e. value key in other dict. traverse through the
# elements if keys are not present in both, store them else check if values are correct or not.

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        dict_s_t = {}
        dict_t_s = {}
        if len(s) != len(t):
            return False
        for i in range(len(s)):
            if s[i] not in dict_s_t and t[i] not in dict_t_s:
                dict_s_t[s[i]] = t[i]
                dict_t_s[t[i]] = s[i]
            else:
                if (s[i] in dict_s_t and dict_s_t[s[i]] != t[i]) or (t[i] in dict_t_s and dict_t_s[t[i]] != s[i]):
                    return False
        return True

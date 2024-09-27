# Did this code successfully run on Leetcode: Yes
# Time Complexity: O(n)
# Space Complexity: O(m) where m is the number of unique characters in s
# Logic: create 2 dict & create key-value of s in 1 & reverse i.e. value key in other dict. traverse through the
# elements if keys are not present in both, store them else check if values are correct or not.

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s = s.split(' ')
        if len(s) != len(pattern):
            return False
        dict_p_s = {}
        dict_s_p = {}
        for i in range(len(pattern)):
            if pattern[i] not in dict_p_s and s[i] not in dict_s_p:
                dict_p_s[pattern[i]] = s[i]
                dict_s_p[s[i]] = pattern[i]
            elif (pattern[i] in dict_p_s and dict_p_s[pattern[i]] != s[i]) or\
                    (s[i] in dict_s_p and dict_s_p[s[i]] != pattern[i]):
                return False
        return True

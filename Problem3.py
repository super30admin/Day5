#
# Time Complexity = O(n) where n is the total number of characters
# Space Complexity = O(n) where n is the total number of characters
# Works on Leetcode https://leetcode.com/problems/word-pattern/
#
class Solution:
    def wordPattern(self, s: str, t: str) -> bool:
        s2t_mapping = {}
        t2s_mapping = {}
        t = t.split()
        if len(s) != len(t):
            return False
        for i in range(len(s)):
            if s[i] in s2t_mapping:
                if t[i] != s2t_mapping[s[i]]:
                    return False
            if t[i] in t2s_mapping:
                if s[i] != t2s_mapping[t[i]]:
                    return False
            else:
                s2t_mapping[s[i]] = t[i]
                t2s_mapping[t[i]] = s[i]
        return True


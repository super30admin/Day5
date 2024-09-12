# Time Complexity : O(n)
# Space Complexity: O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s_map = {}
        t_map = {}

        if len(s) != len(t):
            return False
        for i in range(len(s)):
            if s[i] not in s_map:
                s_map[s[i]] = t[i]
            else:
                if s_map[s[i]] != t[i]:
                    return False
            if t[i] not in t_map:
                t_map[t[i]] = s[i]
            else:
                if t_map[t[i]] != s[i]:
                    return False
        return True
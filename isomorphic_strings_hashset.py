# Time Complexity : O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s_map = {}
        t_set = set()

        if len(s) != len(t):
            return False
        for i in range(len(s)):
            if s[i] not in s_map:
                s_map[s[i]] = t[i]

                if t[i] in t_set:
                    return False
                t_set.add(t[i])
            else:
                if s_map[s[i]] != t[i]:
                    return False
        return True
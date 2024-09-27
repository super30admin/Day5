"""
290 - word pattern
Approach :
same as isomorphic strings problem
TC: O(n)
SC: o(m)
"""


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s_pattern = list(pattern)
        s_split = s.split()
        # print(s_pattern)
        # print(s_split)
        if len(s_pattern) != len(s_split): return False
        s_map = {}
        s_set = set()

        for i in range(len(s_pattern)):
            if s_pattern[i] not in s_map:
                s_map[s_pattern[i]] = s_split[i]
                s_set.add(s_split[i])
            if s_pattern[i] in s_map and s_map.get(s_pattern[i]) != s_split[i]:
                return False
        # print(s_map)
        # print(s_set)
        if len(s_map) != len(s_set):
            return False
        return True
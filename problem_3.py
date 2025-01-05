"""
Problem 3: Word Pattern
time complexity: O(n)
space complexity: O(n)
Approach: Use two hashmaps to store the mapping of the pattern to the string and the mapping of the string to the pattern.
Iterate through the pattern and the string and check if the mapping is consistent.
Return False if the mapping is inconsistent.
Return True if the mapping is consistent.
"""


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        pmap = {}
        smap = {}

        string_list = s.split()
        if len(string_list) != len(pattern):
            return False
        for i in range(len(pattern)):
            if pattern[i] in pmap and pmap[pattern[i]] != string_list[i]:
                return False
            else:
                pmap[pattern[i]] = string_list[i]
            if string_list[i] in smap and smap[string_list[i]] != pattern[i]:
                return False
            else:
                smap[string_list[i]] = pattern[i]
        return True
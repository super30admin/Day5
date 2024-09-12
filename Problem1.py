## Problem 1:
# Given an array of strings, group anagrams together.

# Example:
# Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
# Output:
# [
#   ["ate","eat","tea"],
#   ["nat","tan"],
#   ["bat"]
# ]

# // Time Complexity : O(nlogn) -- sorted time complexity
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode :Yes


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if not strs:
            return []
        groups = collections.defaultdict(list)
        for i in strs:
            groups[tuple(sorted(i))].append(i)
        return groups.values()
            
        
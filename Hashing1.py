"""
# Hashing-1

## Problem 1:
Given an array of strings, group anagrams together.

Example:
Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]

Note:
All inputs will be in lowercase.
The order of your output does not matter.
time complexity : -  O(n+ klogk)
space complexity : - O(n)
"""
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hash_map = dict()
        l = list()
        z = str()
        for i in strs:
            z = "".join(sorted(i))
            if z not in hash_map:
                hash_map[z] = [i]
            else:
                hash_map[z].append(i)
        for k,v in hash_map.items():
            l.append(v)
        return l

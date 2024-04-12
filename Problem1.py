## Problem 1:
#Given an array of strings, group anagrams together

# Approach
# Sort all the words in the string. Add sorted word as key and unsorted word as value in hashmap. 
# Print all the values in hmap

# Time Complexity: O( n * klogk)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if len(strs) == 0:
            return ['']
        hmap = {}
        for i in strs:
            s = ''.join(sorted(i))
            if s in hmap:
                hmap[s].append(i)
            else:
                hmap[s] = [i]

        return hmap.values()
    
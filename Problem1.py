## Problem 1:

#Time Complexity : O(n* k*log k), where n is for the for loop, k log k is for sorted function
# Space Complexity : O(n) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        d = defaultdict(list)
        for str in strs:
            d[''.join(sorted(str))].append(str)
        return d.values()
        
# Problem 1: Group Anagrams

# Time Complexity: O(n*m)
# Space Complexity: O(n*m)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No

# Approach:
# Group anagrams by counting character occurrences using a hash map. 
# Each string's character count is stored in a fixed-size array, converted to a tuple for hashing. 
# The original strings are collected in lists corresponding to their character count keys.

from typing import List
from collections import defaultdict

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashMap = defaultdict(list)
        for s in strs:
            charArr = [0]*26
            for c in s:
                key =  ord(c) - ord('a')
                charArr[key] +=1
            hashMap[tuple(charArr)].append(s)
        
        return list(hashMap.values())  
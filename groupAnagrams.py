# Approach:
# We use a hashmap to group strings by their sorted version as the key, which helps identify anagrams.
# As we iterate through the input list, each string is sorted and stored in the hashmap as a key, with the original string appended to the corresponding value (list).
# At the end, we return the values of the hashmap, which contain grouped anagrams.

# Time Complexity: O(n * k * log(k)), where n is the number of strings and k is the average length of each string (due to sorting).
# Space Complexity: O(n * k) to store the grouped anagrams.
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No

from typing import List
from collections import defaultdict

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # Hashmap to group anagrams with sorted string as the key
        anagram_groups = defaultdict(list)
        
        # Iterate over all strings in the input list
        for s in strs:
            # Sort the string to use as the key
            sorted_str = ''.join(sorted(s))
            # Append the original string to the corresponding group
            anagram_groups[sorted_str].append(s)
        
        # Return the grouped anagrams as a list of lists
        return list(anagram_groups.values())

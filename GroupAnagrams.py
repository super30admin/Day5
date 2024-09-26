# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# We create a dictionary where the keys are the letters of words in sorted order which will ensure that anagrams
# are appended to the same key.

from typing import List
from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        lookup=defaultdict(list)
        for s in strs:
            key=",".join(sorted(list(s)))
            lookup[key].append(s)
        output=[]
        for l in lookup.values():
            output.append(l)
        return output
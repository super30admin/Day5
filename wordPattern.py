"""
Time Complexity : O(N)
Space Complexity : O(N)
Did this code successfully run on Leetcode : yes
Any problem you faced while coding this : no
"""

import collections
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        d_s = collections.defaultdict(list)
        d_t = collections.defaultdict(list)
        
        for i, char in enumerate(pattern):
            d_s[char].append(i)
        
        for j, char in enumerate(s.split(" ")):
            d_t[char].append(j)
         # return d_s.values() == d_t.values()
        
        return list(d_s.values()) == list(d_t.values())
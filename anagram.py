# Time Complexity : 0(nk)
# Space Complexity : 0(nk)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA

from collections import defaultdict
from typing import List


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:   
        result = defaultdict(list)
        for i in range(len(strs)):
             s = strs[i]
             prime_product = self.prime_product(s)
             result[prime_product].append(s)
        return list(result.values())
        
    def prime_product(self, s):
        prime = [ 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 67,     71, 73, 79, 83, 89, 97, 101,103]
        result = 1
        for i in range(len(s)):
            c = s[i]
            result *=  prime[ord(c) - ord("a")]
        return result
       
# Time Complexity: O(N*K* logK)
# Space Complexity: O(NK)

from collections import defaultdict
import collections

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        freq = collections.defaultdict(list)
        
        for string in strs:
            
            str_sorted = sorted(string)
            str_tuple = tuple(str_sorted)
            
            (freq[str_tuple]).append(string)
                
        return freq.values()
        
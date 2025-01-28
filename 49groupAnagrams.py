from collections import defaultdict
from typing import List

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram_map = defaultdict(list)
        for s in strs:
            key = ''.join(sorted(s))
            anagram_map[key].append(s)
        return list(anagram_map.values())
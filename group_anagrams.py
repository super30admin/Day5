# sc : O(n)
# tc :O(n*n*logn) avg/best
from typing import List


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashmap = dict()
        
        for st in strs:
            new_st = str(sorted(st))
            if new_st in hashmap:
                hashmap[new_st].append(st)
            else:
                hashmap[new_st] = [st]
        res = [v for k,v in hashmap.items()]
        return res
        
        
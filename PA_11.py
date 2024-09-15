#LC 49 - Group Anagrams
#Time Complexity - n*(slogs) s - len(string) n - len(strs)
#Space Complexity - O(2n)
from collections import defaultdict
class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        anag = defaultdict(list)
        for st in strs:
            anag["".join(sorted(st))].append(st)
        
        return anag.values()
class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        hashmap = {}
        for st in strs:
            sorted_st = ''+join(sorted(st))
            if sorted_st not in hashmap:
                hashmap[sorted_st] = []
            hashmap[sorted_st].append(st)
        return list(hashmap.values())
        

""""
Time Complexity: O(nlog(n))
Space Complexity:  O(n)
"""

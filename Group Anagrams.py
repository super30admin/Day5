# Time complexity: O(NKlogK)
# Space complexity: O(N)

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        d = collections.defaultdict(list)
        for w in strs:
            d[''.join(sorted(w))].append(w)
        return d.values()
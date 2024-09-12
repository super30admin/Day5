# Time complexity: O(n + k log k)
# Space complexity: O(nk)

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = collections.defaultdict(list)
        for i in strs:
            key = tuple(sorted(i))
            res[key].append(i)
        return res.values()
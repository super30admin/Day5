from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        ans = defaultdict(list)
        for string in strs:
            sorted_str = sorted(string)
            ans[tuple(sorted_str)].append(string)
        
        return list(ans.values())
        
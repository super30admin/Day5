# Time complexity - O(nklogk)
# Space Complexity - O(1) 
# Executed in leetcode - yes

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        ans = collections.defaultdict(list)
        for char in strs:
            ans[tuple(sorted(char))].append(char)
        return ans.values()
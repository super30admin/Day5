# Time complexity: O(n)
# Space complexity: O(n)
# Does this code run leetcode: Yes
# Did you face any difficulty in coding the solution: No

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        ans = collections.defaultdict(list)
        
        for s in strs:
            count = [0] * 26
            for c in s:
                count[ord(c) - ord('a')] += 1
            ans[tuple(count)].append(s)
        return ans.values()

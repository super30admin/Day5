Time Complexity: O(NKlogK)
Space Complexity:O(NK)
Code run on leetcode: Yes

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        strings = collections.defaultdict(list)
        for s in strs:
            strings[tuple(sorted(s))].append(s)
        return strings.values()
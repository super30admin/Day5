# Time Complexity : O(N) 
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        result = collections.defaultdict(list)
        for word in strs:
            sorted_word = ''.join(sorted(word))
            result[sorted_word].append(word)
        return result.values()

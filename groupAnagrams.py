"""
// Time Complexity : O(N * KlogK) , where k  = len of average string
// Space Complexity : O(N)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :
"""

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        res = collections.defaultdict(list)
        for string in strs:
            temp = "".join(sorted(string))
            res[temp].append(string)
        return res.values()
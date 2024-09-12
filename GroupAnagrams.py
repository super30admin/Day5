"""
Time Complexity : O(nklog(k)) where n is the length of strs and k is max legth in strs
Space Complexity : O(nk)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
"""
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        ans = collections.defaultdict(list)
        # We sort each words and then assign a value of lists 
        # matching that sorted word in the dictionary
        for s in strs:
            ans[tuple(sorted(s))].append(s)
        return ans.values()
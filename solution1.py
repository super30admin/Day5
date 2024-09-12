# Time Complexity : O(NK) where N is length of strs list and K is max length of a string in strs
# Space Complexity : O(NK)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach


import collections

class Solution:
    def group_anagrams(self, strs):
        
        ans=collections.defaultdict(list)
        
        for s in strs:
            count=[0]*26
            for c in s:
                count[ord(c)-ord('a')]+=1
            # tuple is hashable
            ans[tuple(count)].append(s)
        return ans.values()
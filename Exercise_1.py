# Time Complexity: O(nk) -> k is avg length of strings
# Space Complexity: O(nk) -> space taken by tuple - as it is of fixed length 26 is constant.
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this : No

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        ans = collections.defaultdict(list)
        for s in strs:
            count = [0]*26
            for c in s:
                count[ord(c)-ord('a')]+=1
            ans[tuple(count)].append(s)
        return ans.values()
            
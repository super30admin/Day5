# Time Complexity: O(n*k) where n is length of strs and k is length of each string in str
# Space Complexity: O(n*k)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
import collections
class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        result = collections.defaultdict(list)
        for string in strs:
            count = [0]*26
            for s in string:
                count[ord(s) - ord('a')] += 1
            result[tuple(count)].append(string)
        return result.values()
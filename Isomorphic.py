# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No

class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        map = {}
        if len(s) != len(t):
            return False
        for idx, sVal in enumerate(s):
            if sVal in map:
                if map[sVal] != t[idx]:
                    return False
            else:
                if t[idx] in map.values():
                    return False
                else:
                    map[sVal] = t[idx]
        return True

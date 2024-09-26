# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        sMap  = {}
        tMap = {}
        for i in range(len(s)):        
            if sMap.has_key(s[i]) and sMap[s[i]] != t[i]:
                return False
            elif tMap.has_key(t[i]) and tMap[t[i]] != s[i]:
                return False
            sMap[s[i]] = t[i]
            tMap[t[i]] = s[i]
        return True
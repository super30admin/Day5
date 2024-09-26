#  Time Complexity : O(n^2)
# // Space Complexity :O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :
# // Your code here along with comments explaining your approach
class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        Pseudocode:


        """
        map_s = {}
        map_t = {}
        if len(s) != len (t):
            return False
        else:
            for i in range(0,len(s)):
                if (s[i] in map_s):
                    if (map_s[s[i]] != t[i]):
                        return False
                if (t[i] in map_t):
                    if (map_t[t[i]] != s[i]):
                        return False

                map_s[s[i]] = t[i]
                map_t[t[i]] = s[i]
        return True




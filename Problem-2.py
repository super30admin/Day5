# Time Complexity :O(n)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no


# Your code here along with comments explaining your approach
class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s) != len(t):
            return False
        dic = {}
        #map each letter to another letter
        for i in range(len(s)):
            if s[i] in dic:
                if dic[s[i]] == t[i]:
                    continue
                else:
                    return False
            else:
                dic[s[i]] = t[i]
        myset = set()
        # make sure that the same letter was not mapped to two
        for i in dic.values():
            if i in myset:
                return False
            else:
                myset.add(i)
        return True
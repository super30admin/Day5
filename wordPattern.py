#  Time Complexity : O(n^2)
# // Space Complexity :O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :
# // Your code here along with comments explaining your approach

class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """

        dict_pattern = {}
        word_added = set()
        s = s.split(" ")
        if len(s) != len(pattern):
            return False
        else:
            for i in range(0,len(pattern)):
                if pattern[i] in dict_pattern:
                    if dict_pattern[pattern[i]] != s[i]:
                        return False
                else:
                    if s[i] in word_added:
                        return False
                    else:
                        dict_pattern[pattern[i]] = s[i]
                        word_added.add(s[i])
            return True

#  Time Complexity : O(n)
#  Space Complexity : O(1)
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : No

#  https://leetcode.com/problems/isomorphic-strings/
#  Your code here along with comments explaining your approach 
#  I created a dictionary where the key is the character from string s and 
#  the value is the character from string t. I also created a set to keep track of the mapped values.

class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s) != len(t):
            return False
        di={}
        mapped_values = set()
        for i in range(len(s)):
            if s[i]  in di:
                if di[s[i]] != t[i]:
                    return False
            else:
                if t[i] in mapped_values:
                    return False
                di[s[i]] = t[i]
                mapped_values.add(t[i])
        return True
#  Leet Code Problem 205
#  Isomorphic String
#  Before Class Trial
#  Language Used : Java
#  Link: https://leetcode.com/problems/isomorphic-strings/
#  Runtime: 24 ms, faster than 93.62% of Python online submissions for Isomorphic Strings.
#  Memory Usage: 14.7 MB, less than 71.51% of Python online submissions for Isomorphic Strings.

class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        d = dict()
        c=0
        length_of_string_s = len(s)
        length_of_string_t = len(t)
        for i in range(length_of_string_s):
            if s[i] in d:
                if t[i]==d[s[i]]:
                    c+=1
            else:
                if t[i] not in d.values():
                    d[s[i]]=t[i]
                    c+=1
            print(d)
        if c==length_of_string_s:
            return 1
        else:
            return 0
                        
                    
                    
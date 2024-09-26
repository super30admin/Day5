"""
// Time Complexity : o(n), where n  is the number of strings
// Space Complexity : o(n), dictionary size
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

"""

from collections import defaultdict
class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        d = defaultdict() #creating a defaultdict
        
        if len(s) != len(t) or len(set(s)) != len(set(t)) : #edge conditions, if lengths are unequal or if they have unequal unique values, then return False
            return False
        
        for i in range(len(s)): #mapping each char in s to each char in t
            if s[i] not in d:
                d[s[i]] = t[i]
            else:
                if t[i] != d[s[i]]: #if any point there are two chars in t corresponding to the same char in s, return False 
                    return False
        
        return True
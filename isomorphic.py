# -*- coding: utf-8 -*-
"""
Space Complexity : O(N) as we are using a Hashmap
Time Complexity : O(N) for traversal and O(1) for lookup
Did the program run for all test cases ? Yes
"""

class Solution(object):
   def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):#check for lengths of both strings, if unequal, return fasle
            return False
        #create 2 empty hashmaps for 2 strings
        s_lookup = {}
        t_lookup = {}
		
		# Create mapping to/from chars in s and t
        for i in range(len(s)):
            s_lookup[s[i]] = t[i]
            t_lookup[t[i]] = s[i]
            
        #Check that they match
        for i in range(len(s)):
            if s_lookup[s[i]] != t[i] or t_lookup[t[i]] != s[i]:
                return False
        
        return True
        
S = Solution()

s ="egg"
t ="add"
print(S.isIsomorphic(s,t))
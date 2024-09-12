# -*- coding: utf-8 -*-
"""
Created on Tue Mar 23 13:40:18 2021

@author: jgdch
"""

#Time Complexity:O(N), where N is the length of the input string
#Space Complexity: O(1)
#Passed all leetcode testcases successfully
"""
Solution:
loop over the first string and map each character in the first string to each character in
the second string in the same order and also do the same with the second string( that is
another hashmap with a reverse mapping). If encounter a false mapping then return false else
we can return True if we don't get into any false mapping.

"""

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if(len(s)!=len(t)):
            return False
        map_s={}
        map_t={}
        for i in range(len(s)):
            if (s[i] in map_s and t[i]!=map_s[s[i]]):
                return False
            else:
                map_s[s[i]]=t[i]
            if (t[i] in map_t and s[i]!=map_t[t[i]]):
                return False
            else:
                map_t[t[i]]=s[i]
        return True
                
                
                
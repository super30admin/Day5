# -*- coding: utf-8 -*-
"""
Created on Wed Feb  5 13:41:26 2020

@author: WELCOME
"""
"""
Working on Leetcode
Isomorphic strings
Time complexity - O(N) where N is number of words
Space complexity - O(1)
"""

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        from collections import defaultdict
        dicLeft={}
        dicRight={}
        if len(s)!=len(t):
            return False
        else:
            for i in range(len(s)):
                if s[i] not in dicLeft:
                    dicLeft[s[i]]=t[i]
                else:
                    if dicLeft[s[i]]!=t[i]:
                        return False
            for i in range(len(t)):
                if t[i] not in dicRight:
                    dicRight[t[i]]=s[i]
                else:
                    if dicRight[t[i]]!=s[i]:
                        return False
        return True
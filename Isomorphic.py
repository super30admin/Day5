#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Sep  7 19:00:47 2021

@author: ameeshas11
"""

#Time Complexity : O(n)
#Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No

class Solution:
    def map_str(self, s):
        count = 0
        hashmap = {}
        li = [0]*len(s)
        for i in range(len(s)):
            if s[i] in hashmap.keys():
                li[i] = hashmap[s[i]]
            else:
                hashmap[s[i]] = count
                count += 1
                li[i] = hashmap[s[i]]
        return li
                
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        if len(s) != len(t):
            return False
        
        li1 = self.map_str(s)
        li2 = self.map_str(t)
        if li1 == li2:
            return True
        else:
            return False
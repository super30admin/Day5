#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Fri Sep 10 00:55:07 2021

@author: ameeshas11
"""
#Time Complexity : O(n)
#Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        hashmap1 = {}
        hashmap2 = {}
        s = list(s.split(" "))
        
        if len(pattern) != len(s):
            return False
        
        for i in range(len(pattern)):
            if pattern[i] in hashmap1.keys():
                if s[i] in hashmap2.keys():
                    if hashmap1[pattern[i]] != s[i] or hashmap2[s[i]] != pattern[i]:
                        return False
                else:
                    return False
            elif s[i] in hashmap2.keys():
                return False
            else:
                hashmap1[pattern[i]] = s[i]
                hashmap2[s[i]] = pattern[i]
        return True
    
#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Sep  7 18:50:53 2021

@author: ameeshas11
"""


#Time Complexity : O(n)
#Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashmap = {}
        out = []
        for word in strs:
            w = sorted(word)
            w = tuple(w)
            if w in hashmap.keys():
                hashmap[w].append(word)
            else:
                hashmap[w] = [word]
                
        for key in hashmap.keys():
            out.append(hashmap[key])
            
        return out
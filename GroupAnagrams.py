#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Mon Nov 25 12:23:58 2019

@author: tanvirkaur
"""

'''Time complexity = O(n)
Space complexity = O(n)
if we consider sorting time complexity will be O(n*mlogm) where n is the total length of strs and m is the length of single word
Leetcode acceptance = Yes'''
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dict1 = {}
        for i in strs:
            key = ''.join(sorted(i))
            if key in dict1:
                dict1[key].append(i)
            else:
                dict1[key] = [i]
        return dict1.values()
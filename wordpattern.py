#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Mon Nov 25 13:07:31 2019

@author: tanvirkaur
"""

# Time complexity = O(n)
# Space complexity = O(1)
class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        str_s= str.split()
        print(str_s)
        dict1 = {}
        dict2 = {}
        # base case:
        if len(pattern)!= len(str_s):
            return False
        for i in range(len(pattern)):
            if pattern[i] not in dict1:
                dict1[pattern[i]] = str_s[i]
            else:
                if dict1[pattern[i]] != str_s[i]:
                    return False
            if str_s[i] not in dict2:
                dict2[str_s[i]] = pattern[i]
            else:
                if dict2[str_s[i]] != pattern[i]:
                    return False
        return True
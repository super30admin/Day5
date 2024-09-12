#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Mon Nov 30 12:07:35 2020

@author: gerrard
"""

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
'''One to many mapping not allowed
Many to one mapping not allowed
a is mapped to i
i is mapped to k - is correct
a is mapped to i
a is mapped to k - Not allowed
a is mapped to i
k is mapped to i - Not allowed
We will take 2 dictionary(Hashmap in java).
smap - To check mapping of characters from s to t
tmap - To check mapping of characters from t to s
'''
        smap = {}
        tmap = {}
        if len(s) != len(t):
            return False
        for i in range(0,len(s)):
            a = s[i]
            b = t[i]
            if a not in smap.keys():
                smap[a] = b
            elif smap[a] != b:
                return False
            if b not in tmap.keys():
                tmap[b] = a
            elif tmap[b] != a:
                return False
        return True
# -*- coding: utf-8 -*-
"""
Created on Wed Feb  5 13:39:10 2020

@author: WELCOME
"""
"""
Group Anagrams
Working on Leetcode
Time - O(n)
Space - O(1)
"""

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        from collections import defaultdict
        dictionary=defaultdict(list)
        for word in strs:
            arr=[0]*26
            for char in word:
                arr[ord(char)-ord('a')]+=1
            dictionary[tuple(arr)].append(word)
        return dictionary.values()
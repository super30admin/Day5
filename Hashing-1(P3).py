# -*- coding: utf-8 -*-
"""
Created on Tue Mar 23 16:24:58 2021

@author: jgdch
"""

#Time Complexity:O(N), where N is the number of words in the pattern
#Space Complexity: O(N), where N is the number of words in the string s
#Passed all leetcode testcases successfully
"""
Solution:
loop over the pattern and map each character in the pattern to each word in
the string in the same order and also do the same with the second string( that is
another hashmap with a reverse mapping). If encounter a false mapping then return false else
we can return True if we don't get into any false mapping.

"""


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words_s=s.split(" ")
        map_s={}
        map_pattern={}
        if(len(words_s)!=len(pattern)):
            return False
        for i in range(len(pattern)):
            if (pattern[i] in map_pattern and words_s[i]!=map_pattern[pattern[i]]):
                return False
            else:
                map_pattern[pattern[i]]=words_s[i]
            if (words_s[i] in map_s and pattern[i]!=map_s[words_s[i]]):
                return False
            else:
                map_s[words_s[i]]=pattern[i]
        return True
                
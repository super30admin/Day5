#!/usr/bin/env python
# coding: utf-8

# In[1]:


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        lst = s.split(' ')        
        if len(pattern) != len(lst):
            return False
        hash1 = {}
        hash2 = {}
        for i in range(len(pattern)):
            if pattern[i] not in hash1.keys():
                hash1[pattern[i]] = lst[i]
            else:
                if hash1[pattern[i]] != lst[i]:
                    return False
        for i in range(len(pattern)):
            if lst[i] not in hash2.keys():
                hash2[lst[i]] = pattern[i]
            else:
                if hash2[lst[i]] != pattern[i]:
                    return False       
        return True
        


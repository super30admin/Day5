#!/usr/bin/env python
# coding: utf-8

# In[1]:


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        lst = s.split(' ')        
        if len(pattern) != len(lst):
            return False
        hash1 = {}
        my_set = set()
        for i in range(len(pattern)):
            if pattern[i] in hash1:
                if lst[i] != hash1[pattern[i]]:
                    return False
                
            else:
                if lst[i] in my_set:
                    return False
                else:
                    hash1[pattern[i]] = lst[i]
                    my_set.add(lst[i])
            
        return True


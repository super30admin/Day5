#!/usr/bin/env python
# coding: utf-8

# Given an array of strings strs, group the anagrams together. You can return the answer in any order.
# 
# An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
# 
#  
# 
# Example 1:
# 
# Input: strs = ["eat","tea","tan","ate","nat","bat"]
# Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
# Example 2:
# 
# Input: strs = [""]
# Output: [[""]]
# Example 3:
# 
# Input: strs = ["a"]
# Output: [["a"]]
#                 

# In[3]:


class Solution:
    def groupAnagrams(self, strs):
        record = {}
        for strng in strs:
            key = str(sorted(strng))
            print(key)
            if key not in record:
                record[key] = [strng]
            else:
                record[key].append(strng)
        result = []
        for key in record:
            result.append(record[key])
        return result


# In[ ]:





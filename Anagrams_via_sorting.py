#!/usr/bin/env python
# coding: utf-8

# In[ ]:


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if strs == None or len(strs) == 0:
            return []
        hash1 = {}
        sort_lst = []
        for strings in strs:
            sort_lst.append(''.join(sorted(strings)))
            
        # print(sort_lst)
            
        for i in range(len(strs)):
            if sort_lst[i] not in hash1.keys():
                hash1[sort_lst[i]] = []
                hash1[sort_lst[i]].append(strs[i])
            else:
                hash1[sort_lst[i]].append(strs[i])
        return hash1.values()


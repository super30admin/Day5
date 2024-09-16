#!/usr/bin/env python
# coding: utf-8

# In[ ]:


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        hash1 = {}
        hash2 = {}
        nd = len(s)
        for i in range(nd):
            if s[i] not in hash1.keys():
                hash1.update({s[i]: t[i]})
            else:
                if hash1[s[i]] != t[i]:
                    return False
        for j in range(nd):
            if t[j] not in hash2.keys():
                hash2.update({t[j]: s[j]})
            else:
                if hash2[t[j]] != s[j]:
                    return False

        print (hash1)
        print (hash2)
        return True


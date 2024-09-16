#!/usr/bin/env python
# coding: utf-8

# In[ ]:


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if strs == None or len(strs) == 0:
            return []
        hash1 = {}
        prime_prod = 1
        for string in strs:
            prime_prod = self.computeprime(string)
            if prime_prod not in hash1.keys():
                hash1[prime_prod] = []
            hash1[prime_prod].append(string)
            
        return hash1.values()
    
    def computeprime(self,string):
        prime_lst = [ 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,           73, 79, 83, 89, 97,101,103]
        prime_prod = 1
        for i in range (len(string)):
            prime_prod *= prime_lst[ord(string[i])-ord('a')]
            
        return prime_prod


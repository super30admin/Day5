#!/usr/bin/env python
# coding: utf-8

# In[ ]:


#time complexity: O(nk). where 'n' is the length of the pattern or s. and k is the average length of each word in s
#k is included above because each key is being hashed
#space complexity: O(nk). Actually i have a doubt in this. will ask jaspinder in class today.
#below solution worked in leetcode
#did not face any difficulty in solving this problem
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        d1=dict()
        d2=dict()
        s=s.split()
        if len(s)!=len(pattern):
            return False
        for x in range(len(pattern)):
            if pattern[x] in d1.keys():
                if d1[pattern[x]]!=s[x]:
                    return False
            else:
                d1[pattern[x]]=s[x]
            if s[x] in d2.keys():
                if d2[s[x]]!=pattern[x]:
                    return False
            else:
                d2[s[x]]=pattern[x]
        return True


# In[ ]:


#time complexity: O(nklogk). where 'n' is the length of the pattern or s. and k is the average length of each word in strs
#space complexity: O(nk).
#below solution worked in leetcode
#did not face any difficulty in solving this problem
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        d=dict()
        for x in range(len(strs)):
            temp=("".join(sorted(strs[x])))
            if temp in d.keys():
                d[temp].append(strs[x])
            else:
                d[temp]=[strs[x]]
        return [val for val in d.values()]


# In[ ]:


#time complexity: O(n). where 'n' is the length of the s or t.
#space complexity: O(1) because howmuch ever length might be for s and t, there will be only 26 keys in our dictionary.
#below solution worked in leetcode
#did not face any difficulty in solving this problem
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        d1=dict()
        d2=dict()
        for i in range(len(s)):
            if s[i] in d1.keys():
                if (d1[s[i]]!=t[i]):
                       return False
            else:
                d1[s[i]]=t[i]
            if t[i] in d2.keys():
                if d2[t[i]]!=s[i]:
                      return False
            else:
                d2[t[i]]=s[i]
        return True


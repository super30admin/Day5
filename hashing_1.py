# -*- coding: utf-8 -*-
"""Hashing 1.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/1LW-e3D01uM18aJOpKWagQzvYrbHHFKUX

Group Anagrams
"""

from collections import defaultdict
def groupAnagrams( strs):
    """
    :type strs: List[str]
    :rtype: List[List[str]]
    """
    anagrams = defaultdict(list)
    for i in range(len(strs)):
        anagrams[tuple(sorted(strs[i]))].append(strs[i])
    return anagrams.values()
print(groupAnagrams([["eat","tea","tan","ate","nat","bat"]]))

"""Isomorphic Strings"""

def isIsomorphic(s, t):
    """
    :type s: str
    :type t: str
    :rtype: bool
    """
    if len(s) != len(t):
        return False
    s_t = {}
    t_s = {}
    for c1 , c2 in zip(s,t):
        if (c1 not in s_t) and (c2 not in t_s):
            s_t[c1] = c2
            t_s[c2] = c1
    
        elif (s_t.get(c1) != c2) or (t_s.get(c2) != c1):
                return False
        return True
print(isIsomorphic('paper','title'))

"""Word Pattern"""

def wordPattern(pattern, s):


    arr1 = list(pattern) 
    arr2 = s.split() 
    n = len(arr2) 

    if len(arr1) != len(arr2): 
        return False

    d1 = {} 
    d2 = {} 


    for i in range(0, n):
        
        if arr1[i] in d1 and d1[arr1[i]] != arr2[i]:
            return False
        
        if arr2[i] in d2 and d2[arr2[i]] != arr1[i]:
            return False
        
        d1[arr1[i]] = arr2[i] 
        d2[arr2[i]] = arr1[i] 


    return True

print(wordPattern("abba","dog cat dog dog"))
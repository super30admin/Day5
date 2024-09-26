# Hashing-1
Explain your approach in **three sentences only** at top of your code


## Problem 1:
Given an array of strings, group anagrams together.

Example:
Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]

Note:
All inputs will be in lowercase.
The order of your output does not matter.

## Solution 1: 
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        primes = {'a': 2,  'b': 3, 'c': 5,'d': 7, 'e': 11,  'f': 13, 'g': 17,'h': 19,'i': 23 ,'j': 29,
        'k': 31,'l': 37, 'm': 41, 'n': 43,  'o': 47,'p': 53,  'q': 59,  'r': 61, 's': 67, 
     't': 71, 'u': 73, 'v': 79,'w': 83,'x': 89, 'y': 97,'z': 101}
        
        d = collections.defaultdict(list)
        for s in strs: 
            prod = 1
            for char in s: 
                prod = primes[char] * prod
            d[prod].append(s)
        return list(d.values()) 

Approach = store all in a 


##
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        ans = collections.defaultdict(list)
        for s in strs:
            count = [0] * 26
            for c in s:
                count[ord(c) - ord('a')] += 1
                print(ord(c) - ord('a'))
            ans[tuple(count)].append(s)
        return ans.values() 

##
class Solution(object):
    def groupAnagrams(self, strs):
        ans = collections.defaultdict(list)
        for s in strs:
            ans[tuple(sorted(s))].append(s)
        return ans.values()

##
from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram_dict = dict()
        for i in strs:
            sorted_str = "".join(sorted(i))
            if sorted_str not in anagram_dict:
                anagram_dict[sorted_str] = []
                anagram_dict[sorted_str].append(i) 
            else:
                 anagram_dict[sorted_str].append(i)
        return list(anagram_dict.values())


## Problem 2:
Given two strings s and t, determine if they are isomorphic.
Two strings are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

Example 1:
Input: s = "egg", t = "add"
Output: true

Example 2:
Input: s = "foo", t = "bar"
Output: false

Example 3:
Input: s = "paper", t = "title"
Output: true
Note:
You may assume both s and t have the same length.
## 
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        d = {}
        d2={}
        for i in range(len(s)):
            if s[i] not in d: 
                d[s[i]] = t[i]
            elif(d[s[i]] != t[i] ):
                return False
            
            if t[i] not in d2:
                d2[t[i]] = s[i]
            elif d2[t[i]] != s[i]:
                return False
        return True
            

## Problem 3:
Given a pattern and a string str, find if str follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Example 1:
Input: pattern = "abba", str = "dog cat cat dog"
Output: true

Example 2:
Input:pattern = "abba", str = "dog cat cat fish"
Output: false

Example 3:
Input: pattern = "aaaa", str = "dog cat cat dog"
Output: false

Example 4:
Input: pattern = "abba", str = "dog dog dog dog"
Output: false
Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.
##
•	My solution:
class Solution(object):
    def wordPattern(self, pattern, s):
        d1 = {}
        d2 = {}
        t = s.split(" ")
        print(t)
        if len(pattern) != len(t):
            return False
        for i in range(len(pattern)):
            if pattern[i] not in d1: 
                d1[pattern[i]] = t[i]
            elif  d1[pattern[i]] != t[i]:
                print("a")
                return False
            if t[i] not in d2: 
                d2[t[i]] = pattern[i]
            elif  d2[t[i]] != pattern[i]:
                return False
        return True
•	Approach 2: Mine. 
class Solution(object):
    def wordPattern(self, pattern, s):
        d = {}
        k = set()
        t = pattern 
        s = s.split(" ")
        if len(s) != len(t):
            return False
        for i in range(len(s)):
            if s[i] not in d:
                d[s[i]] = t[i]
                if t[i] in k:
                    return False
                else:
                    k.add(t[i])
            if s[i] in d and d[s[i]]!=t[i]:
                return False
        return True              

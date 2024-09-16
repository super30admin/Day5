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
#Time Complexity=O(NK); k= length of string
#Space Complexity=O(1); As 26 fixed size array being used
class Solution(object):
    def groupAnagrams(self, strs):
        ans=collections.defaultdict(list)
        for s in strs:
            d=[0]*26
            for c in s:
                d[ord(c)-ord('a')]+=1
            ans[tuple(d)].append(s)
        return ans.values()

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
#Time Complexity=O(N)
#Space Complexity=O(k);k= no.of unique characters in pattern
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        h1={}
        h2={}
        for i,j in zip(s,t):
            if i not in h1 and j not in h2:
                h1[i]=j
                h2[j]=i
            elif h1.get(i)!=j or h2.get(j)!=i:
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
#Time Complexity=O(N)
#Space Complexity=O(k);k= no.of unique characters in pattern
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        h1={}
        h2={}
        k=list(pattern)
        l=s.split()
        if len(k)!=len(l):
            return False
        for i,j in zip(l,k):
            if j not in h1 and i not in h2:
                h1[j]=i
                h2[i]=j
            elif h1.get(j)!=i or h2.get(i)!=j:
                return False
        return True
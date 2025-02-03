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



class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        primeList=[2,3,5,7,11,13,17,19,23,29,31,37,43,47,53,59,61,67,71,73,79,83,89,97,101,103]
        anagrams ={}
        for str in strs:
            stringProduct = self.findPrimeProduct(str,primeList)
            if stringProduct in anagrams:
                anagrams[stringProduct].append(str)
            else:
                anagrams[stringProduct] = [str]

        anagramList=[]
        for keys in anagrams:
            anagramList.append(anagrams[keys])
        return anagramList




    def findPrimeProduct(self,str,primeList):
        product = 1
        for char in str:
            product *=  primeList[ord(char)-ord('a')]
        return product
        

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


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        if(len(s)!=len(t)):
            return False
        
        Smap = {}
        Tmap = {}

        for i in range(len(s)):

            if s[i] not in Smap:
                Smap[s[i]]= t[i]
            else:
                if Smap[s[i]]!=t[i]:
                    return False

            if t[i] not in Tmap:
                Tmap[t[i]]=s[i]
            else:
                if Tmap[t[i]]!=s[i]:
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

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:

        String  = s.split()

        if (len(String)!=len(pattern)):
            return False
        
        Pmap={}
        Smap={}

        for i in range (len(String)):

            if (pattern[i] not in Pmap):
                Pmap[pattern[i]] = (String[i])
            else:
                if Pmap[pattern[i]] != String[i]:
                    return False
            
            if (String[i] not in Smap):
                Smap[String[i]] = pattern[i]
            else:
                if Smap[String[i]] != pattern[i]:
                    return False
        return True

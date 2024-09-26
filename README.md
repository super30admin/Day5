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
        
        dictionary = {}
        for s in strs:
            check = self.computePrime(s)
            if check in dictionary:
                dictionary[check].append(s)
            else:
                dictionary[check] = [s]
        return dictionary.values()
    
    def computePrime(self, s) -> int:
        prime = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        result = 1
        for i in range(len(s)):
            a = s[i]
            result = result * prime[ord(a) - ord('a')]
        return result
<!-- # Time complexity: O(n), n - average length of longest string in strs
# Space complexity: O(n)
# Approach: Exploit the properly of prime numbers: Product of two different prime numbers is always unique.Take the first 26 prime numbers. Map it to its position in the array using the alphabetical number order.Multiply it repetetively to get a unique value for every word. Map the value to the dictionary in the format: {value:[List of strings]}. Return List of strings once the entire strs has been traversed.     -->

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
        dictionary_s = {}
        dictionary_t = {}
        if len(s) != len(t):
            return False
        for i in range(len(s)):
            char_s = s[i]
            char_t = t[i]
            if char_s not in dictionary_s:
                dictionary_s[char_s] = char_t
            else:
                if dictionary_s[char_s] != char_t:
                    return False
            if char_t not in dictionary_t:
                dictionary_t[char_t] = char_s
            else:
                if dictionary_t[char_t] != char_s:
                    return False
        return True
    
<!-- #Time Complexity: O(n) -->
<!-- # Space Complexity: O(n^2) 2- hash maps involved. 
# Approach:  one to check mapping from s to t and the other from t to s. 
#                               check for all the cases where it could be false and return false if any discrepancy is 
#                               found, once the entire string is traversed return true. -->




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
        s = s.split()
        if len(pattern) != len(s):
            return False
        dictionary_ps = {}
        dictionary_sp = {}
        for i in range(len(pattern)):
            char_p = pattern[i]
            if char_p not in dictionary_ps:
                dictionary_ps[char_p] = s[i]
            else:
                if dictionary_ps[char_p] != s[i]:
                    return False
            char_s = s[i]
            if char_s not in dictionary_sp:
                dictionary_sp[char_s] = pattern[i]
            else:
                if dictionary_sp[char_s] != pattern[i]:
                    return False
        return True
    
<!-- # Time Complexity: O(n) [n - Length of the pattern] 
# Space Complexity: O(n^2) [ 2 hash maps involved]
# Approach: use two hashmaps -> one to check mapping from pattern to s and the other from s to pattern. 
#                               check for all the cases where it could be false and return false if any discrepancy is 
#                               found, once the entire string is traversed return true.  -->

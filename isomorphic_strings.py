"""
Time Complexity : O(n)
Space Complexity : O(n)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : I was trying to access keys with bracket notation (letter_map[s[i]]),
but kept encountering errors because a key was not present. To resolve this issue I used get() function.

Problem:
Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t. All occurrences of a character 
must be replaced with another character while preserving the order of characters. No two characters 
may map to the same character but a character may map to itself.

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
"""

class Solution:
    def isIsomorphic(self, s, t):
        letter_map = {}
        
        # map each char with corresponding char
        for i in range(len(s)):
            if s[i] not in letter_map.keys() and t[i] not in letter_map.values():
                    letter_map[s[i]] = t[i]
            elif t[i] != letter_map.get(s[i]):      # using get() method b/c it avoids throwing error if key is not present in dict
                return False
        
        return True

s = Solution()
print(s.isIsomorphic('egg','add'))
print(s.isIsomorphic('paper','add'))
print(s.isIsomorphic('paper','title'))
print(s.isIsomorphic('ab','aa'))
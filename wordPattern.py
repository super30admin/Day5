"""
Time Complexity : O(n)
Space Complexity : O(n)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this: none

Problem:
Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a 
non-empty word in str.

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
You may assume pattern contains only lowercase letters, and str contains lowercase letters that 
may be separated by a single space.
"""

class Solution:
    def wordPattern(self, pattern, s):
        word_map = {}
        arr = s.split(' ')
        
        for i in range(len(pattern)):
            if s[i] not in word_map.keys():
                word_map[s[i]] = arr[i]
            elif arr[i] != word_map.get(s[i]):
                return False
        
        return True

s = Solution()
print(s.wordPattern('abba', "dog cat cat dog"))
"""
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

Time Complexity: ON
Space Complexity:ON

"""

class Solution(object):
    def wordPattern(self, pattern, str):
        """
        :type pattern: str
        :type str: str
        :rtype: bool
        """
        mp1 = {}
        mp2 = {}
        words = str.split(' ')
        if len(words)!=len(pattern):
            return False
        for word, ch in zip(words, pattern):
            if word not in mp1 and ch not in mp2:
                mp1[word] = ch
                mp2[ch] = word
            elif mp1.get(word) == ch and mp2.get(ch) == word:
                pass
            else:
                return False
        
        return True
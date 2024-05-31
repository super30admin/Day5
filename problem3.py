'''
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

'''

'''
Approach:
- split the string on the blank space to get an array of word strings
- now this problem can be solved using an approach similar to the isomorphic strings problem
- each character from pattern should be checked with the corresponding word similar to the isometric strings problem

TC: O(nk) where n is length of pattern and k is average length of each word
SC: O(n)

'''

class Solution:
  def wordPattern(self, pattern: str, s: str) -> bool:
    words = s.split()
    if len(pattern) != len(words):
      return False
    patternMap = {}
    wordsSet = set()
    for idx in range(len(pattern)):
      patternChar = pattern[idx]
      word = words[idx]
      if patternChar not in patternMap:
        if word in wordsSet:
          return False
        patternMap[patternChar] = word
        wordsSet.add(word)
      else:
        if patternMap[patternChar] != word:
          return False
    return True

s = Solution()
pattern1 = "abba"
str1 = "dog cat cat dog"

pattern2 = "abba"
str2 = "dog cat cat fish"

pattern3 = "aaaa"
str3 = "dog cat cat dog"

pattern4 = "abba"
str4 = "dog dog dog dog"

sol = Solution()
print('pattern = {}\nstr = {}\nwordPattern() = {}'.format(pattern1, str1, sol.wordPattern(pattern1, str1)))
print()
print('pattern = {}\nstr = {}\nwordPattern() = {}'.format(pattern2, str2, sol.wordPattern(pattern2, str2)))
print()
print('pattern = {}\nstr = {}\nwordPattern() = {}'.format(pattern3, str3, sol.wordPattern(pattern3, str3)))
print()
print('pattern = {}\nstr = {}\nwordPattern() = {}'.format(pattern4, str4, sol.wordPattern(pattern4, str4)))

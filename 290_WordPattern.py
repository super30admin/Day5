"""
Leetcode - https://leetcode.com/problems/word-pattern/ (submitted)
TC - O(s + p) - word split + iterating; s - no of characters in s, SC - O(s + 2w) - two hashmap and word split array
Challenge - NA
Lecture - https://youtu.be/2riNDAD4GgM
FAQ - *refer 209_WordPattern*

Given a pattern and a string s, find if s follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

Example 1:
Input: pattern = "abba", s = "dog cat cat dog"
Output: true

Example 2:
Input: pattern = "abba", s = "dog cat cat fish"
Output: false

Example 3:
Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false

Constraints:
1 <= pattern.length <= 300
pattern contains only lower-case English letters.
1 <= s.length <= 3000
s contains only lowercase English letters and spaces ' '.
s does not contain any leading or trailing spaces.
All the words in s are separated by a single space.
"""


'''
Idea- *same as isomorphic strings Leetcode 205* 
Two hashmaps approach.
'''
class Solution:
    def wordPattern(self, pattern, s):
        dict_p, dict_w = {}, {}
        words = s.split()
        if len(pattern) != len(words):
            return False
        for i in range(len(pattern)):
            if pattern[i] not in dict_p:
                if words[i] in dict_w:
                    return False
                dict_p[pattern[i]] = words[i]
                dict_w[words[i]] = 1
            else:
                if words[i] != dict_p[pattern[i]]:
                    return False

        return True

pattern, s = 'acca', 'b b b b'
isPatternMatch = Solution().wordPattern(pattern, s)
print(isPatternMatch)

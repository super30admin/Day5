'''
====== Submission Details =======
Student Name: Pavan Kumar K. N.
S30 SlackID : RN32MAY2021
=================================
'''

#-------------  
# Explanation:
#-------------
# 290. Word Pattern

# Given a pattern and a string s, find if s follows the same pattern.

# Here follow means a full match, such that there is a bijection between a 
# letter in pattern and a non-empty word in s.

# All occurrences of a character must be replaced with another character while 
# preserving the order of characters. No two characters may map to the same 
# character, but a character may map to itself.


# Example 1:

# Input: pattern = "abba", s = "dog cat cat dog"
# Output: true
# Example 2:

# Input: pattern = "abba", s = "dog cat cat fish"
# Output: false
# Example 3:

# Input: pattern = "aaaa", s = "dog cat cat dog"
# Output: false
# Example 4:

# Input: pattern = "abba", s = "dog dog dog dog"
# Output: false

# Constraints:

# 1 <= pattern.length <= 300
# pattern contains only lower-case English letters.
# 1 <= s.length <= 3000
# s contains only lower-case English letters and spaces.
# s does not contain any leading or trailing spaces.
# All the words in s are separated by a single space

#-----------------
# Time Complexity: 
#-----------------
# O(N): N is number of words in the str
#------------------
# Space Complexity: 
#------------------
# O(M) - Auxiliary space required to store hashmap of maximum 'M' unique words
# Second hashmap of char to word can be atmost 256 keys in length

#-----------------------
# Leet Code Performance: 
#-----------------------
# Ran Successfully?: Yes
# Time             :  36 ms   (5.76 %ile)
# Space            :  14.3 MB (53.02 %ile)

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        word_list = s.split(" ")
        char_map = {}
        word_map = {}

        if len(word_list) != len(pattern):
            return False

        for char, word in zip(pattern, word_list):
            if char not in char_map:
                if word in word_map:
                    return False
                else:
                    char_map[char] = word
                    word_map[word] = char
            else:
                if char_map[char] != word:
                    return False
        
        return True


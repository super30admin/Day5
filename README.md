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

from collections import defaultdict

def group_anagrams(strs):
    """
    Groups anagrams from a given list of strings.

    :param strs: List of strings to group
    :return: List of groups of anagrams
    """
    anagrams = defaultdict(list)

    for word in strs:
        # Use the sorted word as the key
        key = tuple(sorted(word))
        anagrams[key].append(word)

    return list(anagrams.values())

Example usage
input_strings = ["eat", "tea", "tan", "ate", "nat", "bat"]
output = group_anagrams(input_strings)
print(output)


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
def are_isomorphic(s: str, t: str) -> bool:
    Create two dictionaries to store the mappings
    s_to_t_mapping = {}
    t_to_s_mapping = {}

    Iterate through characters of both strings
    for char_s, char_t in zip(s, t):
        Check if mapping exists and is consistent
        if (char_s in s_to_t_mapping and s_to_t_mapping[char_s] != char_t) or \
           (char_t in t_to_s_mapping and t_to_s_mapping[char_t] != char_s):
            return False

        Add or update the mapping
        s_to_t_mapping[char_s] = char_t
        t_to_s_mapping[char_t] = char_s

    return True

Example usage
s1, t1 = "egg", "add"
s2, t2 = "foo", "bar"
s3, t3 = "paper", "title"

print(are_isomorphic(s1, t1))  # Output: True
print(are_isomorphic(s2, t2))  # Output: False
print(are_isomorphic(s3, t3))  # Output: True


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

def word_pattern(pattern: str, s: str) -> bool:
    words = s.split()
    
    If the lengths don't match, it's not a valid pattern
    if len(pattern) != len(words):
        return False

    Create dictionaries for mapping
    char_to_word = {}
    word_to_char = {}

    for char, word in zip(pattern, words):
        Check and maintain bijection
        if char in char_to_word:
            if char_to_word[char] != word:
                return False
        else:
            char_to_word[char] = word

        if word in word_to_char:
            if word_to_char[word] != char:
                return False
        else:
            word_to_char[word] = char

    return True

Test cases
print(word_pattern("abba", "dog cat cat dog"))  # Output: True
print(word_pattern("abba", "dog cat cat fish")) # Output: False
print(word_pattern("aaaa", "dog cat cat dog")) # Output: False
print(word_pattern("abba", "dog dog dog dog")) # Output: False


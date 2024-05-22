"""
Hashing-1

Given a pattern and a string str, find if str follows the same pattern. Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Example 1: Input: pattern = "abba", str = "dog cat cat dog" Output: true

Example 2: Input:pattern = "abba", str = "dog cat cat fish" Output: false

Example 3: Input: pattern = "aaaa", str = "dog cat cat dog" Output: false

Example 4: Input: pattern = "abba", str = "dog dog dog dog" Output: false Notes: You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.

Time Complexity : O(m) where m is the max length of the string among pattern & s before splitting the s.
Space Complexity : O(1) because at max there can be 52 chars if we include upper case as well.
Any problem you faced while coding this : No

Your code here along with comments explaining your approach:
This is similar to isomorphic but only difference is this is a string to character mapping whereas isomorphic is character to character mapping.
Three approaches: 
1. HashMap + HashMap - Also retrieval in hashmap for strings is not O(1) but actually O(m) where m is length of string & here is s is a m length string which we're splitting into array of strings.
Approach is we're going to one on one mapping while traversing pattern. Before traversal we split the s into array of strings and we start mapping each char in pattern to its correspondence element 
in s array and when we find collision we check if has the one on one mapping else return false. 
2. HashMap + HashSet - We use hashmap for pattern - array of strings mapping and hash set to store array of strings to keep track of whether that string is already inserted or not.
Here S.C in worst case O(n) since we're storing s array of strings of length n.
"""

# Approach 1 
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split(" ")
        if len(pattern) != len(words):
            return False
        
        pattern_hash_map = {}
        word_hash_map = {}

        for i in range(len(pattern)):
            if pattern[i] in pattern_hash_map:
                if pattern_hash_map[pattern[i]] != words[i]:
                    return False
            else:
                pattern_hash_map[pattern[i]] = words[i]

            if words[i] in word_hash_map:
                if word_hash_map[words[i]] != pattern[i]:
                    return False
            else:
                word_hash_map[words[i]] = pattern[i]
        
        return True

# Approach 2
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split(" ")
        if len(pattern) != len(words):
            return False
        
        pattern_hash_map = {}
        word_hash_set = set()

        for i in range(len(pattern)):
            if pattern[i] in pattern_hash_map:
                if pattern_hash_map[pattern[i]] != words[i]:
                    return False
            else:
                if words[i] not in word_hash_set:
                    pattern_hash_map[pattern[i]] = words[i]
                    word_hash_set.add(words[i])
                else:
                    return False
        
        return True


          
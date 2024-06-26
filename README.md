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

#Time Complexity: O(n*klogk)
#Space Complexity:O(n*k)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

#Sort each string and use the sorted string as a key in a dictionary to group anagrams(Anagrams when sorted will result in the same string. Using this sorted string as a key ensures that all anagrams are grouped together). 
# Collected the grouped anagrams from the dictionary into a result list.
def groupAnagrams(strs):
    hash_map = {}
    for s in strs:
        sorted_str = ''.join(sorted(s))
        if sorted_str in hash_map:
            hash_map[sorted_str].append(s)
        else:
            hash_map[sorted_str] = [s]

    collisions_handled = []
    for key in hash_map:
        collisions_handled.append(hash_map[key])
    return collisions_handled

strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
print(groupAnagrams(strs))

Note:
All inputs will be in lowercase.
The order of your output does not matter.

## Problem 2:
Given two strings s and t, determine if they are isomorphic.
Two strings are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

#Time Complexity: O(n)
#Space Complexity:O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

#Use two dictionaries to establish a bijective mapping- This ensures that each character in string s maps to exactly one character in string t and same way reverse.
def isIsomorphic(s: str, t: str) -> bool:
    if len(s) != len(t):
        return False
    s_t_mapping = {}
    t_s_mapping = {}
    for char_s, char_t in zip(s, t):
        if char_s in s_t_mapping:
            if s_t_mapping[char_s] != char_t:
                return False
        else:
            s_t_mapping[char_s] = char_t
        if char_t in t_s_mapping:
            if t_s_mapping[char_t] != char_s:
                return False
        else:
            t_s_mapping[char_t] = char_s
    return True

s1, t1 = "egg", "add"
s2, t2 = "foo", "bar"
s3, t3 = "paper", "title"
print(isIsomorphic(s1, t1))  # Output: True
print(isIsomorphic(s2, t2))  # Output: False
print(isIsomorphic(s3, t3))  # Output: True

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

## Problem 3:
Given a pattern and a string str, find if str follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.


#Time Complexity: O(n+m) - m - length of pattern, n - length of string s
#Space Complexity:O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

#Splitted the string s into words and check if the length matches the pattern
#Used two dictionaries(s to pattern and pattern to s mapping) to establish a bijection between the characters in pattern and words in s

class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        words = s.split()
        if len(words) != len(pattern):
            return False
        s_pat_mapping = {}
        pat_s_mapping = {}
        for char,word in zip(pattern,words):
            if char in s_pat_mapping:
                if s_pat_mapping[char] != word:
                    return False
            else:
                s_pat_mapping[char] = word
        
            if word in pat_s_mapping:
                if pat_s_mapping[word] != char:
                    return False
            else:
                pat_s_mapping[word] = char
    
        return True
        
pattern = "abba"
s = "dog cat cat dog"
solution = Solution()
print(solution.wordPattern(pattern,s))


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

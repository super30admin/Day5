"""
Problem: Given a pattern and a string str, find if str follows the same pattern.
    Here follow means a full match, such that there is a bijection between a letter in pattern
    and a non-empty word in str.
    Example 1: Input: pattern = "abba", str = "dog cat cat dog" Output: true
    Example 2: Input:pattern = "abba", str = "dog cat cat fish" Output: false
    Example 3: Input: pattern = "aaaa", str = "dog cat cat dog" Output: false
    Example 4: Input: pattern = "abba", str = "dog dog dog dog" Output: false
    Notes: You may assume pattern contains only lowercase letters,
    and str contains lowercase letters that may be separated by a single space.
Leetcode: https://leetcode.com/problems/word-pattern/
Time Complexity: O(n), n is the length of given string
Space Complexity: O(n) to store hashmap and string
Leetcode: Pass
Any problems: No
"""


class Solution:
    def wordPattern(self, pattern, s):
        # Define two hashmaps for two given strings
        smap = {}
        tmap = {}

        arr = s.split()
        if len(pattern) != len(arr):
            return False

        for i in range(len(pattern)):
            a = pattern[i]
            b = arr[i]

            if a not in smap.keys():
                smap[a] = b
            else:
                if smap[a] != b:
                    return False
            if b not in tmap.keys():
                tmap[b] = a
            else:
                if tmap[b] != a:
                    return False
        return True


obj = Solution()
print(obj.wordPattern("abba", "dog cat cat dog"))
print(obj.wordPattern("abba", "dog cat cat ship"))
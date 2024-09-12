"""
Problem: Given two strings s and t, determine if they are isomorphic.
    Two strings are isomorphic if the characters in s can be replaced to get t.
    All occurrences of a character must be replaced with another character while preserving the order of characters.
    No two characters may map to the same character but a character may map to itself.
    Example 1: Input: s = "egg", t = "add" Output: true
    Example 2: Input: s = "foo", t = "bar" Output: false
    Example 3: Input: s = "paper", t = "title" Output: true Note: You may assume both s and t have the same length.
Leetcode: https://leetcode.com/problems/isomorphic-strings/
Time Complexity: O(n), n is the length of given string
Space Complexity: O(n) to store hashmap and string
Leetcode: Pass
Any problems: No
"""


class Solution:
    def isIsomorphic(s, t):

        # define two dictionaries for two strings
        smap = {}
        tmap = {}

        if len(s) != len(t):
            return False

        for i in range(len(s)):
            a = s[i]
            b = t[i]

            # verify if a exists in smap.keys
            if a not in smap.keys():
                smap[a] = b
            else:
                if smap.get(a) != b:
                    return False
            # Verify if b exists in tmap.keys
            if b not in tmap.keys():
                tmap[b] = a
            else:
                if tmap.get(b) != a:
                    return False
        return True


obj = Solution
print(obj.isIsomorphic("egg", "add"))
print(obj.isIsomorphic("foo", "bar"))
print(obj.isIsomorphic("fan", "tra"))





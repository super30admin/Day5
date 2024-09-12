"""
Given two strings s and t, determine if they are isomorphic.
Two strings are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters.
No two characters may map to the same character but a character may map to itself.

Example 1: Input: s = "egg", t = "add" Output: true

Example 2: Input: s = "foo", t = "bar" Output: false

Example 3: Input: s = "paper", t = "title" Output: true Note: You may assume both s and t have the same length.

"""

# def Isomorphic(s, t):

s = "eaa"
t = "ade"
dict1={}
if len(s) != len(t):
    print (False)
for i in range(len (s)):
    if s[i] not in dict1:
        dict1[s[i]] = t[i]
    elif dict1[s[i]] != t[i]:
        print (False)
print (True)


"""
1) Each alphabet of the strings are compared using dictionary. In case of mismatch, false is returned
else, true is returned

"""

"""

Time Complexity : O(1)
Space Complexity : O(1)

"""

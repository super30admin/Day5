"""
Problem 2:
Given two strings s and t, determine if they are isomorphic. Two strings are isomorphic if the characters in s can be
replaced to get t. All occurrences of a character must be replaced with another character while preserving the order of
characters. No two characters may map to the same character but a character may map to itself.

Example 1: Input: s = "egg", t = "add" Output: true
Example 2: Input: s = "foo", t = "bar" Output: false
Example 3: Input: s = "paper", t = "title" Output: true Note: You may assume both s and t have the same length.

Approach --
0. if len(s) == len(t), strings are isomorphic
1. Traverse through each character of both s and t
2. Use hashmap to map s to t. Use hashset to map t
3. if length of hashmap and hashset are different, then they are not isomorphic
TC - O(n) since traversing through both strings
SC - O(1) since there are specific number of characters. if the data set was really large, then the SC would change
"""
# s = "paper"
# t = "title"

# s = "egg"
# t = "add"

s = "bbbaaaba"
t = "aaabbbba"

def isIsomorphic(s, t):
    if len(s) != len(t):
        return False
    if s is None and t is None:
        return True

    s_map = {}
    t_set = set()

    for i in range(len(s)):
        if s[i] not in s_map:
            s_map[s[i]] = t[i]
        if s[i] in s_map and s_map.get(s[i]) != t[i]:
            return False


    for j in range(len(t)):
        # if t[j] not in t_set:
        t_set.add(t[j])
    print(s_map)
    print(t_set)
    if len(s_map) != len(t_set):
        return False
    return True


print(isIsomorphic(s, t))
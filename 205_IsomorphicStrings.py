"""
Leetcode - https://leetcode.com/problems/isomorphic-strings/ (submitted)
TC - O(N), SC - O(2N)
Challenge - Coming up with two hashmap solution and what should hold what
Lecture - https://youtu.be/2riNDAD4GgM
FAQ - Why do you need two different hashmaps? Because if 'a' -> 'b' and then you put d['a'] and d['b'] in one stack,
we will not be able to map 'b' -> 'd' since 'b' already exists in our map.

Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters.
No two characters may map to the same character, but a character may map to itself.

Example 1:
Input: s = "egg", t = "add"
Output: true

Example 2:
Input: s = "foo", t = "bar"
Output: false

Example 3:
Input: s = "paper", t = "title"
Output: true

Constraints:
1 <= s.length <= 5 * 10^4
t.length == s.length
s and t consist of any valid ascii character.
"""

'''
Idea -  
We need to create an onto mapping. To do so, we keep s-> t in hashmap 's', whereas hashmap 't' will hold t.
We can check isomorphism with the two hashmaps.
If 'g' is mapped 't' and 'p' tries to map to 't', t is already in hashmap 't', strings are not isomorphic  
'''


class Solution:
    def isIsomorphic(self, s, t):
        dict_s, dict_t = {}, {}
        if len(s) != len(t):
            return False
        for i in range(len(s)):
            if s[i] not in dict_s:
                if t[i] in dict_t:
                    return False
                dict_s[s[i]] = t[i]
                dict_t[t[i]] = 1
            else:
                if t[i] != dict_s[s[i]]:
                    return False

        return True


s, t = 'foo', 'bar'
is_isomorphic = Solution().isIsomorphic(s, t)
print(is_isomorphic)

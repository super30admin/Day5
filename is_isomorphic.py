"""
Hashing-1

Problem 2:
Given two strings s and t, determine if they are isomorphic. Two strings are isomorphic if the characters in s can be replaced to get t. All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

Example 1: Input: s = "egg", t = "add" Output: true

Example 2: Input: s = "foo", t = "bar" Output: false

Example 3: Input: s = "paper", t = "title" Output: true Note: You may assume both s and t have the same length.

Time Complexity : O(n) since we have to traverse the strings 
Space Complexity : O(1) since at max it'll have twice of 52 chars of upper+lower if considered unique in s and t strings. so max can be O(104) which is constant time. 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Your code here along with comments explaining your approach:
We can solve this in three approaches: 
1. HashMap + HashMap - We use two hashmaps to make one to one mapping. Terminating conditions will be when we insert t_char in s_map, we check if s_map[s_char] is not empty if not then we check if the value in it is t_char else we return false and similar for t_map.
2. HashMap + HashSet - We use hashmap to keep tract of s to t. We use hash set to keep track of t_char that are inserted.
3. Integer asci array of 128 to keep track of alphabets - we use both integer arrays & we store there ascii values in the respective indices and when we don't one to one mappings, it's an invalid case.

"""

# Approach 1
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) == 0 or len(t) == 0:
            return False

        hash_map_s = {}
        hash_map_t = {}

        for i in range(len(s)):
            s_char = s[i]
            t_char = t[i]
            if s_char in hash_map_s:
                if hash_map_s[s_char] != t_char:
                    return False
            else: 
                hash_map_s[s_char] = t_char
                if t_char in hash_map_t:
                    if hash_map_t[t_char] != s_char:
                        return False
                else:
                    hash_map_t[t_char] = s_char

        return True
        


# Approach 2
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if not s or not t or len(s) == 0 or len(t) == 0:
            return False

        hash_map_s = {}
        hash_set_t = set()

        for i in range(len(s)):
            s_char = s[i]
            t_char = t[i]
            if s_char in hash_map_s:
                if hash_map_s[s_char] != t_char:
                    return False
            else: 
                hash_map_s[s_char] = t_char
                if t_char in hash_set_t:
                    return False
                hash_set_t.add(t_char)

        return True
    
    # Approach 3
    class Solution:
        def isIsomorphic(self, s: str, t: str) -> bool:
            if not s or not t or len(s) == 0 or len(t) == 0:
                return False

            s_arr = [-1] * 128 # since we're only consider lower & upper case alphabets
            t_arr = [-1] * 128 # since we're only consider lower & upper case alphabets

            for i in range(len(s)):
                s_char_idx = ord(s[i])
                t_char_idx = ord(t[i])
                if s_arr[s_char_idx] != -1:
                    if s_arr[s_char_idx] != t_char_idx:
                        return False
                else: 
                    s_arr[s_char_idx] = t_char_idx
                    if t_arr[t_char_idx] != -1:
                        if t_arr[t_char_idx] != -s_char_idx:
                            return False
                    else:
                        t_arr[t_char_idx] = s_char_idx

            return True
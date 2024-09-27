'''https://leetcode.com/problems/isomorphic-strings/
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character 
while preserving the order of characters. No two characters may map 
to the same character, but a character may map to itself.

Example:
 s = "egg", t = "add"  --> True

 s = "aggh" t = "fddd" --> False

 s = "aggg" t = "fdde" --> False

'''
# Time Complexity : O(N) where N is len(input string)
# Space Complexity : O(1) hash map only contains 26 ascii chars
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

''' USING 2 hashmaps'''
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s_list = list(s)
        t_list = list(t)
        mapping = {}
        rev_map = {}
        
        for i, c in enumerate(s_list):
            if mapping.get(c) is None:
                mapping[c] = t_list[i]
                if rev_map.get(t_list[i]) is not None:
                    return False
                else:
                    rev_map[t_list[i]] = c
            else:
                if mapping.get(c) != t_list[i]:
                    return False
        
        return True


''' USING a hashmap and a Set'''
class Solution2:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s_list = list(s)
        t_list = list(t)
        s_map = {}
        s_set = set()
        # e g g
        # a d d
        if len(s_list) != len(t_list): return False
        
        for i, s_char in enumerate(s_list):
            t_char = t_list[i]
            if s_map.get(s_char) is not None:
                if s_map.get(s_char) != t_char:
                    return False
            else:
                s_map[s_char] = t_char
                # check if the t_char value is already taken by some other key
                if t_char in s_set:
                    return False
                else:
                    s_set.add(t_char) # add 'value' element to set
        
        return True
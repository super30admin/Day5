# Time Complexity : O(n) [n = length of the input list] 
# Space Complexity : O(n)
# 
# Did this code successfully run on Leetcode : Yes
# 
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach 
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        # If length of s and t is not same return false
        if len(s)!=len(t): return False
        
        s_map, t_map = {},{}
        
        for i in range(len(s)):
            s_char = s[i]
            t_char = t[i]

            # Pattern does not match if one the following three conditions occur 
            # 1. s_char key exist in s_map but corresponding t_char key does not exist in t_map
            # 2. s_char key exist in s_map but s_map already holds a different value than t_char for key s_char
            # 3. s_char key exist in s_map but t_map does not contains the value s_char for key t_char
            if s_char in s_map and ( not s_map[s_char] in t_map or  t_map[s_map[s_char]] != s_char or s_map[s_char] !=t_char):
                return False
            # Similar check as above other way round
            if t_char in t_map and (not t_map[t_char] in s_map or s_map[t_map[t_char]] != t_char or t_map[t_char] !=s_char):
                return False
            # Add the value in s_map and t_map
            s_map[s[i]] = t[i]
            t_map[t[i]] = s[i]
        return True
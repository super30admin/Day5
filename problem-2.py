'''
Approach: Iterate through both the strings. For string 1, add corresponding char of string 2 to dictionary if not present already and vice versa. If dictionary already has a key for character in string1, check if the value is matching character in string 2. Repeat the same from string 2 to string 1. If there is any mismatch return false, else return true

Time: O(N)
Space: O(1) as both dictionary will have constant space less than 26.

Passes all testcases in leetcode
'''
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t): return False
        s_map = {}
        t_map = {}
        for i in range(len(s)):
            x=s[i] 
            y = t[i]
            if x in s_map:
                if s_map[x] != y: return False
            else:
                s_map[x] = y
            if y in t_map:
                if t_map[y] != x: return False
            else:
                t_map[y] = x
        return True
            
            
        

# Time Complexity = O(n) , traverse both strings exactlt once O(2n) = O(n)
# Space Complexity = O(1) , size of ASCII character set is fixed
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        map_s_t = {}
        map_t_s = {}
        
        for c1, c2 in zip(s, t):
            
            # if mapping does not exist, map both the characters to eac other
            if c1 not in map_s_t and c2 not in map_t_s:
                map_s_t[c1] = c2
                map_t_s[c2] = c1
                
            # if exists, check if key matches the corresponding value in both dicts
            elif map_s_t.get(c1) != c2 or map_t_s.get(c2) != c1:
                return False
        
        return True
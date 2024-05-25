# TIme complexity O(n)
# Space complexity O(1)
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False 
        s_to_t_map = {}
        t_to_s_map = {}
        for s_char, t_char in zip(s, t):
            if s_char in s_to_t_map:
                if s_to_t_map[s_char] != t_char:
                    return False
            else:
                s_to_t_map[s_char] = t_char
            
            if t_char in t_to_s_map:
                if t_to_s_map[t_char] != s_char:
                    return False
            else:
                t_to_s_map[t_char] = s_char

        return True
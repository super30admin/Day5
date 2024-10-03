# TC AND SC O(n)
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        s_map = {}
        t_map = {}
        
        for charIn_s, charIn_t in zip(s, t):
            if charIn_s in s_map:
                if s_map[charIn_s] != charIn_t:
                    return False
            else:
                s_map[charIn_s] = charIn_t
            
            if charIn_t in t_map:
                if t_map[charIn_t] != charIn_s:
                    return False
            else:
                t_map[charIn_t] = charIn_s
        
        return True
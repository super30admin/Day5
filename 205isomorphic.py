class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        s_map = {}
        t_map = {}

            # check if the length of pattern and words are the same
        if len(s) != len(t):
            return False

        for char_s, char_t in zip(s,t):
            if char_s in s_map and s_map[char_s] != char_t:
                return False
            if char_t in t_map and t_map[char_t] != char_s:
                return False
            
            #Add the mapping 
            s_map[char_s] = char_t
            t_map[char_t] = char_s
        
        return True
                

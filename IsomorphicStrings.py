# TC: O(N) where N is length of strings.     
# SC: O(1) since we will be needing only 26 + 26 space for hashmap at max, therefore constant.

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        dict_s = {}
        dict_t = {}
        for i in range(len(s)):
            s_char = s[i]      
            t_char = t[i]
            if not s_char in dict_s:    
                dict_s[s_char] = t_char
            else:
                if s_char != dict_t.get(t_char) or t_char != dict_s.get(s_char) :
                    return False
            
            if not t_char in dict_t:
                dict_t[t_char] = s_char     
            else:
                if t_char != dict_s.get(s_char) or s_char != dict_t.get(t_char):
                    return False
        return True

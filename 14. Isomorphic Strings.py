# Time Complexity: O(n)    
# Space Complexity: O(1) 

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s_dict = {}
        t_dict = {}
        
        if len(s) != len(t): return False
        
        for i in range(0, len(s)):
            s_letter = s[i]
            t_letter = t[i]
            
            #putting in s_dict
            if s_letter in s_dict:
                if t_letter != s_dict[s_letter]:
                    return False
            else:
                s_dict[s_letter] = t_letter
                
            #putting in s_dict
            if t_letter in t_dict:
                if s_letter != t_dict[t_letter]:
                    return False
            else:
                t_dict[t_letter] = s_letter
        
        return True
            
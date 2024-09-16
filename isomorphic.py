class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s2t = {}
        t2s = {}
        
        if len(s) != len(t):
            return False
        
        for c1, c2 in zip(s, t):
            # String 1 to string 2 mapping
            s2t[c1] = s2t.get(c1, c2)
            
            # String 2 to String 1 mapping
            t2s[c2] = t2s.get(c2, c1)
            
            if s2t[c1] != c2 or t2s[c2] != c1:
                return False
        
        return True
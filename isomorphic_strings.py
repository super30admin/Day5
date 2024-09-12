#time complexity: O(N)
#space complexity: O(1)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s)!= len(t):
            return False
        s_t = {}
        t_s ={}
        for i in range(0, len(s)):
            cs= s[i]
            ct = t[i]
            if cs not in s_t:
                s_t[cs] = ct
            else:
                if s_t[cs] != ct:
                    return False
                elif ct in t_s and t_s[ct] != cs:
                    return False
            
            if ct not in t_s:
                t_s[ct] = cs
            else:
                if t_s[ct] != cs:
                    return False
                elif cs in s_t and s_t[cs] != ct:
                    return False

        return True
        
        
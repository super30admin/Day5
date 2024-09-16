#Time Complexity O(n)
#Space Complexity O(1)

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        p_data = dict()
        v_data = dict()
        
        for x in range(len(s)):
            p = s[x]
            v = t[x]
            
            if p not in p_data:
                p_data[p]=v
            else:
                if p_data[p] != v:
                    return False
            
            if v not in v_data:
                v_data[v]=p
            else:
                if v_data[v] != p:
                    return False
        return True
        
        
        

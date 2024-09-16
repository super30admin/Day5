#Time Complexity O(n)
#Space Complexity O(1)

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        val = s.split()
        if len(pattern) != len(val):
            return False
        
        low = 0
        high = len(val)-1
        
        p_data=dict()
        v_data=dict()
        
        for x in range(len(pattern)):
            p = pattern[x]
            v = val[x]
            
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
                
            
        
                
        
        
                
        
        
            
            
        
        
        
        
        
        
        

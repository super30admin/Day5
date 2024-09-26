class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False 
        
        if len(set(list(s))) != len(set(list(t))):
            return False 
        
        forward = dict()
        reverse = dict()
        
        for si, ti in zip(s,t):
            
            if si in forward.keys():
                if forward[si]!=ti:
                    return False
            elif ti in reverse.keys():          
                if reverse[ti]!=si:
                    return False

            forward[si] = ti
            reverse[ti] = si
                
        return True
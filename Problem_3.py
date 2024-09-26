"""

Time Complexity : O(n)
Space Complexity : O(n * k)
    
"""

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        hash_ = {}
        slist = s.split()
        if len(slist) != len(pattern):
            return False 
        
        for i in range(len(pattern)):
            
            if pattern[i] not in hash_:
                if slist[i] not in hash_.values():
                    hash_[pattern[i]] = slist[i]
                    continue 
                else:
                    return False 
            
            else:
                if hash_[pattern[i]] != slist[i]:
                    return False
        
        
        return True 
                
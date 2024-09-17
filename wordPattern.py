# Time complexity :- O(N)

# Space Complexity :- O(N)

# Ran on leetcode :- yes. 

# Any problems:- No. 



class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        pts = dict()
        s = s.split()
        
        if len(pattern) != len(s):
            return False
        
        for i in range(len(pattern)):
            
            if pattern[i] not in pts and s[i] not in pts.values():
                pts[pattern[i]] = s[i]
                continue
                
            if pattern[i] in pts and pts.get(pattern[i]) == s[i]:
                    continue
                    
            return False
        
        return True
                
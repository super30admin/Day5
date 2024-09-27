'''
-- Passes test cases on Leetcode
'''

class Solution:
    #O(n) -- Time Complexity where n is length of each string; O(1) -- Space Complexity 
    def isIsomorphic(self, s: str, t: str) -> bool:
        maps = {}
        mapt = {}
        
        for i in range(len(s)):
            if s[i] not in maps:
                maps[s[i]] = t[i]
            else:
                if maps[s[i]] != t[i]:
                    return False
            
            if t[i] not in mapt:
                mapt[t[i]] = s[i]
                
            else:
                if mapt[t[i]] != s[i]:
                    return False
        return True
        
        

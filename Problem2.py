# Time Complexity: O(N)
# Space Complexity: O(N)
# Passed Leetcode: Passed

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        m1 = {}
        m2 = {}
        
        for i in range(len(s)):
            
            if (s[i] not in m1 and  t[i] in m2) or (t[i] not in m2 and s[i] in m1):
                    return False
                               
            elif t[i] not in m2:
                    m1[s[i]] = t[i]
                    m2[t[i]] = s[i] 
            
            elif m1[s[i]] != t[i] or m2[t[i]] != s[i]:
                return False
            
        return True
                
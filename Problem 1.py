# Time complexity - O(N)
# Space complexity - O(1)
# Executed in leetcode - yes

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        s_hash = {}
        t_hash = {}
        
        for i in range(0, len(s)):
            if s[i] in s_hash:
                if s_hash[s[i]] != t[i]:
                    return False
            else:
                s_hash[s[i]] = t[i]
        
        for j in range(0, len(t)):
            if t[j] in t_hash:
                if t_hash[t[j]] != s[j]:
                    return False
            else:
                t_hash[t[j]] = s[j]
                
        
        return True

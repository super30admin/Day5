# 205. Isomorphic Strings

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False
        
        maps = {}
        mapt = {}
        
        for i in range(len(s)):
            if s[i] not in maps:
                maps[s[i]] = t[i]
            else:
                if maps[s[i]] != t[i]: #Checks the one to one condition
                    return False
            
            if t[i] not in mapt:
                mapt[t[i]] = s[i]
            else:
                if mapt[t[i]]!=s[i]: #Checks the one to one condition
                    return False
        return True
                

# Time Complexity: O(N) 
# Space Complexity: O(N)
# Accepted on Leetcode: Yes
# Faced any difficulty solving: No.
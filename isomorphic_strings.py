#Time complexity: O(length)
#Space complexity: O(1)

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        h1 = {}
        h2 = {}
        
        for i in range(0, len(s)):
            if s[i] in h1 and t[i] != h1[s[i]]:
                return False
            h1[s[i]] = t[i]
            
        for i in range(0, len(t)):
            if t[i] in h2 and s[i] != h2[t[i]]:
                return False
            h2[t[i]] = s[i]
            
        return True

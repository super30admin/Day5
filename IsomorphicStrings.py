# Time Complexity : O(N)
# Space Complexity : O(N)

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        d_s, d_t = {}, {}
        
        for i in range(len(s)): # builds the first dictionary
            if s[i] not in d_s:
                d_s[s[i]] = t[i]
            else:
                if d_s[s[i]] != t[i]:
                    return False
                else:
                    continue
                
        for j in range(len(t)): # builds the second dictionary
            if t[j] not in d_t:
                d_t[t[j]] = s[j]
            else:
                if d_t[t[j]] != s[j]:
                    return False
                else:
                    continue
        return True
#T(C) : O(N)
#S(C) : O(L), L being the words in dict

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        hmap_p = {}
        hmap_s = {}
        s = s.split()
        if len(pattern) != len(s):
            return False
        
        for i in range(len(pattern)):
            if pattern[i] not in hmap_p and s[i] not in hmap_s:
                hmap_p[pattern[i]] = s[i]
                hmap_s[s[i]] = pattern[i]
            elif hmap_p.get(pattern[i]) != s[i]:
                return False
            
        return True

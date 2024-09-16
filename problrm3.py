class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        map_pattern = {}
        map_s = {}
        
        words = s.split(' ')
        if len(words) != len(pattern):
            return False
        
        for c, w in zip(pattern, words):
            if c not in map_pattern:
                if w not in map_s:
                    map_pattern[c] = w
                    map_s[w] = c
                else:
                    return False
                    
            else:
                if map_pattern[c] != w:
                    return False
        return True
        
        
        tc ---> o(n)
        sc ---> o(n)
        

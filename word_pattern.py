class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        s = s.split(' ')
        if len(pattern) != len(s):
            return False
        
        hm = {}
        hs = set()
        for i in range(len(pattern)):
            if pattern[i] not in hm:
                if s[i] in hs:
                    return False
                hm[pattern[i]] = s[i]
                hs.add(s[i])
            elif hm[pattern[i]] != s[i]:
                return False
                            
        return True
        
        
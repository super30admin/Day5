class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        d = dict()
        k = dict()
        s = s.split()
        
        if(len(pattern)!=len(s)):
            return False
        
        for i in range(len(pattern)):
            if(pattern[i] in d):
                if(d[pattern[i]]!=s[i]):
                    return False
            else:
                d[pattern[i]]=s[i]
            if(s[i] in k):
                if(k[s[i]]!=pattern[i]):
                    return False
            else:
                k[s[i]]=pattern[i]
        return True
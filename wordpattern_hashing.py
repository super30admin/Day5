class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        patterndict = dict()
        sdict = dict()
        s1 = s.split(' ')
        if len(pattern)!=len(s1):
            return False
        for i in range(len(pattern)):
            if pattern[i] not in patterndict:
                patterndict[pattern[i]] = s1[i]
            else:
                if patterndict[pattern[i]] != s1[i]:
                    return False
            if s1[i] not in sdict:
                sdict[s1[i]] = pattern[i]
            else:
                if sdict[s1[i]] != pattern[i]:
                    return False
        return True
            
# this implementation takes O(n) complexity where n is the length of the string
# time complexity is o(n), where 'n' is the length of the input, i.e length of the pattern or the number of words in the string s.
# space complexity is o(n), where 'n' is the number of words in the string s.

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        ls = s.split()
        if(len(pattern) != len(ls)):
            return False
        d1 = dict()
        d2 = dict()
        for i in range(len(pattern)):
            if(pattern[i] not in d1):
                d1[pattern[i]] = ls[i]
            else:
                if(d1[pattern[i]] != ls[i]):
                    return False
                
            if(ls[i] not in d2):
                d2[ls[i]] = pattern[i]
            else:
                if(d2[ls[i]] != pattern[i]):
                    return False
        return True
                    
            
        
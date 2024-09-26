"""
time complexity: O(n)
space complexity: O(n)
"""
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split()
        pMap = {}
        sMap = {}
        if(len(pattern)!=len(words)):
            return False
        
        for i in range(len(pattern)):
            if(pattern[i] in pMap):
                if(pMap[pattern[i]] != words[i]):
                    return False
            else:
                pMap[pattern[i]] = words[i]
        
        for i in range(len(words)):
            if(words[i] in sMap):
                if(sMap[words[i]] != pattern[i]):
                    return False
            else:
                sMap[words[i]] = pattern[i]
        return True
                
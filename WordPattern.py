class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        # TC: O(nk)
        # SC: O(n)
        slist = s.split(" ")
        patternMap = {}
        strMap = {}
        if len(pattern) != len(slist):
            return False
        for i in range(len(pattern)):
            if pattern[i] in patternMap.keys():
                if patternMap[pattern[i]] != slist[i]:
                    return False 
            else:
                patternMap[pattern[i]] = slist[i]
            
            if slist[i] in strMap.keys():
                if strMap[slist[i]] != pattern[i]:
                    return False
            else:
                strMap[slist[i]] = pattern[i]
        return True
        
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        ssplit = s.split()
        if len(ssplit) != len(pattern):
            return False
        pMap = {}
        sMap = {}
        
        for i in range(len(pattern)):
            if pattern[i] in pMap:
                if pMap.get(pattern[i]) != ssplit[i]:
                    return False
            else:
                pMap[pattern[i]] = ssplit[i]
    
            if ssplit[i] in sMap:
                if sMap.get(ssplit[i]) != pattern[i]:
                    return False
            else:
                sMap[ssplit[i]] = pattern[i]
        return True
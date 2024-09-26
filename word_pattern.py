# Sc : O(n) ,n - length of string
# TC : O(n)

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        map1 = dict()
        map2 = dict()
        pattern = [ch for ch in pattern]
        s = s.split(' ')
        if len(pattern)!= len(s):
            return False
        
        for i in range(len(pattern)):
            if pattern[i] not in map1:
                map1[pattern[i]] = s[i]
                if s[i] not in map2:
                    map2[s[i]] = pattern[i]
                else:
                    if map2[s[i]] != pattern[i]:
                        return False
            else:
                if map1[pattern[i]] != s[i]:
                    return False
                
        return True  
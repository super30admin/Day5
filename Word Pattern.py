class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        dict1, s = {}, s.split()
        if len(s) != len(pattern): return False
        for i in range(len(pattern)):
            if s[i] not in dict1:
                if pattern[i] in dict1.values(): return False
                dict1[s[i]] = pattern[i]
            elif s[i] in dict1:
                if dict1[s[i]] != pattern[i]:
                    return False
        return True



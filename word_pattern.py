
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split(' ')
        mapping = {}
        if len(words) != len(pattern): return False
        for i in range(len(pattern)):
            if pattern[i] in mapping.keys():
                if mapping[pattern[i]] != words[i]:
                    return False
            else:
                if words[i] not in mapping.values():
                    mapping[pattern[i]] = words[i]
                else:
                    return False
            
        return True
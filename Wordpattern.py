#Time complexity: O(N) where N is the length of the pattern.
#Space complexity : O(N)

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        patternMap = {}
        sSet = set()
        words = s.split(" ")
        
        if len(pattern) != len(words):
            return False
        
        for i in range(len(words)):
            if pattern[i] in patternMap:
                if patternMap[pattern[i]] != words[i]:
                    return False
            else:
                if words[i] in sSet:
                    return False
                patternMap[pattern[i]] = words[i]
                sSet.add(words[i])
                
        return True

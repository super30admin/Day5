#Time complexity: O(length)
#Space complexity: O(no. of unique characters and words)

class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        words = str.split()
        
        if len(pattern) != len(words):
            return False
        
        h1 = {}
        h2 = {}
        
        for i in range(0, len(pattern)):
            if pattern[i] in h1 and h1[pattern[i]] != words[i]:
                return False
            h1[pattern[i]] = words[i]
            
        for i in range(0, len(words)):
            if words[i] in h2 and h2[words[i]] != pattern[i]:
                return False
            h2[words[i]] = pattern[i]
            
        return True

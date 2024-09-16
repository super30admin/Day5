#executed on leetcode
#time complexity - O(N)
#space complexity - O(M) M is the number of unique words in s
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        mappingchar = {}
        mappingword = {}
        
        words = s.split(' ')
        if len(words) != len(pattern):
            return False
        
        for c, w in zip(pattern, words):
            if c not in mappingchar:
                if w in mappingword:
                    return False
                else:
                    mappingchar[c] = w
                    mappingword[w] = c
            else:
                if mappingchar[c] != w:
                    return False
        return True
        
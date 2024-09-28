# time complexity: O(n)
# space complexity: O(n)

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        usedWords = set()
        mapping = {}
        reverseMapping = {}        
        words = s.split()

        if len(pattern)!=len(words):
            return False

        for i in range(len(pattern)):
            char = pattern[i]
            word = words[i]

            if char in mapping:
                if mapping[char]!=word:
                    return False
            elif word in reverseMapping:
                if reverseMapping[word]!=char:
                    return False
            else:
                mapping[char]=word
                reverseMapping[word]=char

        return True
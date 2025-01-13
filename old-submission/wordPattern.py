class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        
        # Converts to list
        s = s.split(" ")
        
        if len(pattern) != len(s):
            return False
        
        # Initialize a dict
        charToWords = {}
        wordsToChar = {}
        
        for i in range(0,len(s)):
            
            if (pattern[i] in charToWords) and (charToWords[pattern[i]] != s[i]):
                return False
            
            elif (s[i] in wordsToChar) and (wordsToChar[s[i]] != pattern[i]):
                return False
            
            else:
                charToWords[pattern[i]] = s[i]
                wordsToChar[s[i]] = pattern[i]
        
        return True
'''
-- Passes tets cases on LeetCode
'''

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
    # O(n) -- Time Complexity where n is the no of words in s or characters in pattern
    #O(n) -- Space Complexity 
        
        strings = s.split()
        
        if len(pattern) != len(strings):
            return False
        
        mapPattern = {}
        mapString = {}
        
        #O(m) -- time complexity wehere m is the no of characters in pattern 
        #O(n) -- space complexity 
        for i in range(len(pattern)):
            if pattern[i] not in mapPattern:
                mapPattern[pattern[i]] = strings[i]
            else:
                if mapPattern[pattern[i]] != strings[i]:
                    return False
            if strings[i] not in mapString:
                mapString[strings[i]] = pattern[i]
            else:
                if mapString[strings[i]] != pattern[i]:
                    return False
        return True
                
        
        

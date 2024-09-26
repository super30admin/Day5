# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: all test cases passed
# Any problem you faced while coding this: No

# Approach: Create 2 dictionaries/ hashmaps to map every letter in the pattern string to every individual word and vice-versa. If there
# is a mismatch, then return False. Else, return True

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        if len(pattern) != len(s.split(" ")):
            return False
        
        s_char = s.split(" ")
        mydict = {}
        onedict = {}
        
        for idx in range(0, len(pattern)):
            
            if pattern[idx] in mydict:
                
                if mydict[pattern[idx]]!= s_char[idx]:
                    return False
                
            else:
                mydict[pattern[idx]] = s_char[idx]
            
            if s_char[idx] in onedict:
                
                if onedict[s_char[idx]]!= pattern[idx]:
                    return False
            
            else:
                onedict[s_char[idx]] = pattern[idx]
        
        return True
            




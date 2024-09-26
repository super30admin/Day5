# -*- coding: utf-8 -*-
"""
Space Complexity : O(N) as we are using a Hashmap
Time Complexity : O(N) for traversal and O(1) for lookup
Did the program run for all test cases ? Yes
"""

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        if not s or not pattern or len(s.split(" ")) != len(pattern):
            return False
        
        p_hashmap = {}
        s_hashmap = {}
        
        string = s.split(" ") #store by splitting the whitespaces
        
        for i in range(len(pattern)):
            #store the values of pattern and string at i places in respective hashmaps
            p_hashmap[pattern[i]] = string[i]
            s_hashmap[string[i]] = pattern[i]
            
        for i in range(len(pattern)):
            #match the hashmaps of s and pattern at ith indices
            if s_hashmap[string[i]] != pattern[i] or p_hashmap[pattern[i]] != string[i]:
                return False
            
        return True    
        
    
S = Solution()
s = "CAT dog dog CAT"
pattern = "AbbA"
print(S.wordPattern(pattern,s))
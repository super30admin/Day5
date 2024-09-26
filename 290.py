Time Complexity : O(n)
Space Complexity : O(n)
Runs on LeetCode : Yes
Doubts :  No


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        dict1 = {}
        s = s.split(' ')
        
        if len(s) != len(pattern):
            return False
        
        for i in range(len(s)):
            char_key = "ch" +  pattern[i]
            char_word = "w" + s[i]
            
            
            if char_key not in dict1:
                dict1[char_key] = i
                
            if char_word not in dict1:
                dict1[char_word] = i 
            
            if dict1[char_key] != dict1[char_word]:
                return False
            
        return True
        
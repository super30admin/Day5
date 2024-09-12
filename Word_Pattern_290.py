# Time Complexity: O(n) since we are traversing the array once 
# Space Complexity: O(n) since we are creating 2 different dictionaries and 1 list 
# Code:
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        pattern_dict = {}
        s_dict = {}
        
        n = len(pattern)
        splitted_string = s.split(' ')
        
        m = len(splitted_string)
        
        if n != m:  # Check if the lengths are not equal
            return False
        
        for i in range(n):
            if pattern[i] not in pattern_dict:                      #  Check if current character is not present in the dictionary
                pattern_dict[pattern[i]] = splitted_string[i]
            elif pattern_dict[pattern[i]] != splitted_string[i]:    # If character already present in dictionary, then check if it has same string value, if no then return False
                return False
            
            if splitted_string[i] not in s_dict:                    # Same logic as that of pattern
                s_dict[splitted_string[i]] = pattern[i]
            elif s_dict[splitted_string[i]] != pattern[i]:
                return False
            
        return True
        
# Approach: We follow the same approach as that of isomorphic strings. 
        
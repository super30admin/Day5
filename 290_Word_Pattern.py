# Time Complexity : O(nk) [n = length of the pattern string, k = length of average word separated by space] 
# Space Complexity : O(n)
# 
# Did this code successfully run on Leetcode : Yes
# 
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        s = str.split() # Split the str by spaces
        if len(s)!=len(pattern):return False # If the length is of pattern is not same as the number of words in s -> Return False
        char_map, str_map = {}, {}
        
        for i, char in enumerate(pattern):
            # Pattern does not match if one the following three conditions occur 
            # 1. char key exist in char_map but corresponding string key does not exist in map
            # 2. char key exist in char_map but char_map already holds a different value than s[i]
            # 3. char key exist in char_map but str_map does not contains the value char for key s[i]
            if char in char_map and (not s[i] in str_map or char_map[char] != s[i] or str_map[s[i]] != char):
                return False
            # Similar check as above other way round
            if s[i] in str_map and (not char in char_map or str_map[s[i]] != char or char_map[char] != s[i] ):
                return False
            # Add the value in str_map and char_map
            char_map[char] = s[i]
            str_map[s[i]] = char
        return True
                            
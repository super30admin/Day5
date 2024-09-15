""" Time Complexity : O(n)
 Space Complexity : O(n)
 Did this code successfully run on Leetcode :Yes
 Any problem you faced while coding this : No 
"""

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        s_split = s.split(" ")
        pattern_map = {}
        char_map = {}
        if len(s_split) != len(pattern):
            return False
        
        for i,j in zip(pattern,s_split):
            
            if i not in char_map:
                char_map[i] = j
            elif j != char_map[i]:
                return False
            
            if j not in pattern_map:
                pattern_map[j] = i
            elif i != pattern_map[j]:
                return False
                
        return True
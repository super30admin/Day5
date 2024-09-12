# time complexity: O(N)
#space complexity: O(N)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s_to_pattern = {}
        pattern_to_s = {}
        s_array = s.split(" ")
        if len(s_array) != len(pattern):
            return False
        for i in range(0, len(s_array)):
            p_char = pattern[i]
            s_char = s_array[i]
            if p_char not in pattern_to_s:
                pattern_to_s[p_char] = s_char
            else:
                if pattern_to_s[p_char] != s_char:
                    return False
                elif s_char in s_to_pattern and s_to_pattern[s_char] != p_char:
                    return False
            
            if s_char not in s_to_pattern:
                s_to_pattern[s_char] = p_char
            else:
                if s_to_pattern[s_char] != p_char:
                    return False
                elif p_char in pattern_to_s and pattern_to_s[p_char] != s_char:
                    return False
            
        return True
            
        
        
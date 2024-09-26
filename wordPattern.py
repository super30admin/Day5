# Time Complexity = O(n) 
# Space Complexity = O(1) fixed AsCII 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
    
        map_char={}
        map_word={}

        words = s.split(' ')

        if len(words) != len(pattern):
            return False

        for c, w in zip(pattern, words):
            
            # if c key not present in map_char
            if c not in map_char:
                
                # but if w key present in map_word
                if w in map_word:
                    return False
                
                # if w not present in map_word
                else:
                    map_char[c] = w
                    map_word[w] = c
                
            elif map_char[c] != w:
                return False

        return True
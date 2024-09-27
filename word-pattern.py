class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        left_map={}
        right_map= {}
        array_of_words = s.split(" ")
        if len(pattern) != len(array_of_words):
            return False
        for i in range(len(pattern)):
            
            if pattern[i] in left_map:
                if left_map[pattern[i]]!=array_of_words[i]:
                    return False
            else:
                left_map[pattern[i]] = array_of_words[i]
            
            if array_of_words[i] in right_map:
                if right_map[array_of_words[i]]!=pattern[i]:
                    return False
            else:
                right_map[array_of_words[i]] = pattern[i]
        return True
       
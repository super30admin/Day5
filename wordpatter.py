 def wordPattern(self, pattern: str, s: str) -> bool:
        map_pattern = {}
        map_words = {}
        
        words = s.split(' ')
    
        if len(words) != len(pattern):
            return False
        
        for i in range(len(pattern)):
            pattern_alpha = pattern[i]
            words_alpha = words[i]
            if pattern_alpha not in map_pattern:
                map_pattern[pattern_alpha]=words_alpha
            if words_alpha not in map_words:
                map_words[words_alpha]=pattern_alpha
            if map_pattern[pattern_alpha]!=words_alpha or map_words[words_alpha]!=pattern_alpha:
                return False
        return True
        
        ''' same approach as isomorphic string tc and sc o(n)'''

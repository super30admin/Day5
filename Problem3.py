class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        char= {}
        word = {}
        
        words = s.split(' ')
        
        if len(words) != len(pattern):
            return False
        
        for  c,w in zip(pattern,words):
            if c not in char:
                if w in word:
                    return False
                else:
                    char[c] = w
                    word[w] =c
                    
            else:
                if char[c]!= w:
                    return False
        return True
        
        

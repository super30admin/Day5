# Time complexity: O(m+n)
# Space complexity: O(k)

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        char_mp,word_mp = {},{}
        
        words = s.split(' ')
        if len(words) != len(pattern):
            return False
        
        for c, w in zip(pattern, words):
            if c not in char_mp:
                if w in word_mp:
                    return False
                else:
                    char_mp[c] = w
                    word_mp[w] = c
            else:
                if char_mp[c] != w:
                    return False
        return True
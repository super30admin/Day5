//Time complexity: o(N)
//space complexity: o(n)
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        word = s.split()
        key_p = {}
        key_s = {}
        if len(pattern) == len(word):
            for i in range(len(pattern)):
                if pattern[i] in key_p:
                    if key_p.get(pattern[i]) != word[i]:
                        return False
                else:
                    key_p[pattern[i]] = word[i]
                if word[i] in key_s:
                    if key_s.get(word[i]) != pattern[i]:
                        return False
                else:
                    key_s[word[i]] = pattern[i]
            return True
                    
            
        else:
            return False

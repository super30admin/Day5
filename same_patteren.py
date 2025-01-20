#time_complexity = o(n)
#space_complexity = o(n)

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split()
        if len(pattern) != len(words):
            return False
        p_to_w = {}
        w_to_p = {}
        for i in range(len(pattern)):
            p_char = pattern[i]
            word = words[i]
            if p_char in p_to_w:
                if p_to_w[p_char] != word:
                    return False
            else:
                p_to_w[p_char] = word
            if word in w_to_p:
                if w_to_p[word] != p_char:
                    return False
            else:
                w_to_p[word] = p_char
        return True

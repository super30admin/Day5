'''
T.C: O(N*k) - N - pattern length, k average word length
S.C: O(N)

Intuition:
Have two maps, one for each string and store key value pair as char in s and char in t respectively and vice versa. 
If the previous stored value is not the same, then return false

'''
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        if (not s and pattern) or (not pattern and s):
            return False
        
        pmap = dict()
        wmap = dict()
        p_len = len(pattern)
        words = s.split(" ")
        w_len = len(words)
        
        if p_len != w_len:
            return False
        
        for idx in range(p_len):
            p = pattern[idx]
            word = words[idx]
            if p in pmap:
                if pmap[p] != word:
                    return False
            else:
                pmap[p] = word
            if word in wmap:
                if wmap[word] != p:
                    return False
            else:
                wmap[word] = p
        
        return True
        
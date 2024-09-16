# Time Complexity: O(n)
# Space Complexity: O(n)
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s=s.split(" ")
        if len(s)!=len(pattern): return False
        pmap=dict()
        smap=dict()
        for i in range(len(pattern)):
            p_char=pattern[i]
            s_word=s[i]
            if p_char in pmap:
                if s_word!=pmap[p_char]: return False
            else:
                pmap[p_char]=s_word
            if s_word in smap:
                if p_char!=smap[s_word]: return False
            else:
                smap[s_word]=p_char
        return True
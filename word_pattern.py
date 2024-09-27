'''
Time complexity : O(N) N Number of char in given string
Space Complexity : O(1)
Does the code succeed in Leetcode : Yes
Any problem you faced :  Was difficult to derive the solution
Comment about the code
        
        adda
        eggn
        
        Scan over both strings
                There can be following 3 scenarios
        1) {a:e , d:g} add these to HashMap as they dont have entry in HashMap
            s_t={a:e,d:g}
            t_s={e:a,g:d}
        2) d is in s_t and value is g [do nothing]
           g is in t_s and value is d [do nothing]
        3) another a is in s_t but value is not e
        

'''


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words=s.split()
        if len(pattern)!=len(words):
            return False

        p_w,w_p={},{}
        
        for ch,word in zip(pattern,words):
            if ch not in p_w and word not in w_p:
                p_w[ch]=word
                w_p[word]=ch
            elif p_w.get(ch)!=word or w_p.get(word)!=ch:
                return False
        
        return True
            
        
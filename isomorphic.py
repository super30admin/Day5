

'''
Time complexity : O(N) N Number of char in given string
Space Complexity : O(1)
Does the code succeed in Leetcode : Yes
Any problem you faced :  Was difficult to derive the solution
Comment about the code
'''

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        '''
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
        s_t,t_s={},{}
        

        for c1,c2 in zip(s,t):
            # Map chars from each string when they dont have entry
            if c1 not in s_t and c2 not in t_s:
                s_t[c1]=c2
                t_s[c2]=c1
            # When either of one character is in map
            elif s_t.get(c1)!=c2 or t_s.get(c2)!=c1:
                return False
        
        return True
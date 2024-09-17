#Time Complexity :  O(N)  # iterate through every element
#Did this code successfully run on Leetcode : yes
#Any problem you faced while coding this : no
class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        s_t = {}
        t_s = {}
        
        for e1, e2 in zip(s,t):
            if (e1 not in s_t) and (e2 not in t_s):
                s_t[e1] = e2
                t_s[e2] = e1
                
            elif s_t.get(e1) != e2 or t_s.get(e2) !=e1:
                return False
            
        return True
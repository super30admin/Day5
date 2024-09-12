# Time Complexity : O(min(len(s,t))) size we are running our iterations on zip() of s and t strings
# Space Complexity : O(min(len(s,t))) since we create the zip() object
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class Solution:
    def is_isomorphic(self,s,t):
        
        dict_s = {}
        
        dict_t = {}

        # zip will take care of unequal len test case
        for c1,t1 in zip(s,t):
            if c1 not in dict_s and t1 not in dict_t:
                dict_s[c1] = t1
                dict_t[t1] = c1
            # no need to run entire iteration - optimization
            elif c1 != dict_t.get(t1) or t1 != dict_s.get(c1) :
                return False
        return True
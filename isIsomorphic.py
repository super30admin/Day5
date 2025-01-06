class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s) != len(t):
            return False
            
        s_to_t = {}
        t_to_s = {}
        
        for c1, c2 in zip(s, t):
            if c1 in s_to_t:
                if s_to_t[c1] != c2:
                    return False
            elif c2 in t_to_s:
                if t_to_s[c2] != c1:
                    return False
            else:
                s_to_t[c1] = c2
                t_to_s[c2] = c1
                
        return True



#Time Complexity: O(n) where n is the length of the input strings, since we need to traverse through each character once
#Space Complexity: O(1) because we're using two dictionaries that store at most 256 entries each (one for each possible ASCII character)

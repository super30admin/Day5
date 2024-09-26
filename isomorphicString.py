# leetcode 205 isomorphic string
#TC: O(N)
#SC: O(1)

class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        # use 2 hash maps. suppose there is a char in S that is also present in t
        
        s_hash = {}
        t_hash = {}
        
        if len(s) != len(t):
            return False
        
        for c1, c2 in zip(s, t):
            
            # Case 1: No mapping exists in either of the dictionaries
            if (c1 not in s_hash) and (c2 not in t_hash):
                s_hash[c1] = c2
                t_hash[c2] = c1
            
            # Case 2: Ether mapping doesn't exist in one of the dictionaries or Mapping exists               # and it doesn't match in either of the dictionaries or both            
            elif s_hash.get(c1) != c2 or t_hash.get(c2) != c1:
                return False
            
        return True 
        
        
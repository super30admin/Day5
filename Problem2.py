# Time complexity : O(n)
# Space complexity : O(1)
# Leetcode : Solved and submitted

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        # declaring two hashsets to creating the mapping, one for string s and the other for string t
        hashs = {}
        hasht = {}
        
        # If length is not equal then the string can't be isomorphic as the number of character mappings would be different
        if len(s) != len(t):
            return False
        
        # Traversing over the strings
        for i in range(len(s)):
            sc = s[i]
            tc = t[i]
            
            # Check if the mapping for character from string s is present in the Hashset, if present, then check if the mapping is same of not
            # If not same, then return False as one char in s can have only one mapping to t
            if sc in hashs:            
                if hashs[sc] != tc:
                    return False
            else:
                # If not mapped, then add an entry in the HashSet
                hashs[sc] = tc
            
            # Check if the mapping for character from string t is present in the Hashset, if present, then check if the mapping is same of not
            # If not same, then return False as one char in t can have only one mapping to s
            if tc in hasht:
                if hasht[tc] != sc:
                    return False
            else:
                # If not mapped, then add an entry in the HashSet
                hasht[tc] = sc
            
        return True

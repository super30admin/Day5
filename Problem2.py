# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: all test cases passed
# Any problem you faced while coding this: No


# Approach: Create 2 hashmaps - mapping from s to t and vice-versa. From s to t mapping, check if the character exists in the map, if 
# not, then add the character to the map. If it does, check if the mapping has the same character from the other string. If false, 
# then the strings are not isomorphic.

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        dict_s = dict()
        dict_t = dict()
        
        for idx in range(0, len(s)):
          
            if s[idx] in dict_s:
                elem = t[idx]
                if elem != dict_s[s[idx]]:
                    return False
            else:
                dict_s[s[idx]] = t[idx]
            
            if t[idx] in dict_t:
                elem = s[idx]
                if elem!= dict_t[t[idx]]:
                    return False
            else:
                dict_t[t[idx]] = s[idx]
        
        return True
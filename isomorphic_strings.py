# Time Complexity : O(n)
# Space Complexity: O(1) (Dictonary only contains unique elements)
# Solution using Python Dictionary and Set
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        # Optimize check length as isomorphic strings
        # always have same length
        
        if len(s) != len(t):
            return False
        # Store the mappings
        s_map = {}
        # Set to check if the mapping is repeated
        t_set = set()
        
        
        for i,ch in enumerate(s):
            t_char = t[i]
            # Check if s_char in mapping
            if ch in s_map:
                # if present and the new char does not map the old char
                if s_map[ch] != t_char:
                    return False
            else:
                # add the char to mapping
                s_map[ch] = t[i]
                # check if mapping is already present
                if t[i] in t_set:
                    return False
                # add the mapped char    
                t_set.add(t[i])
            
        return True
    
    
                    
                
            
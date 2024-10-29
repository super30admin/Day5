# Approach:
# We use two hashmaps to keep track of character mappings: one from s to t and another from t to s.
# As we iterate through both strings, we check and ensure consistent one-to-one mapping between the characters.
# If any mapping inconsistency is found, we return False; otherwise, the strings are isomorphic.

# Time Complexity: O(n), where n is the length of the strings.
# Space Complexity: O(n), since we store mappings for each character in both strings.
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        # Two hashmaps to track mappings from s -> t and t -> s
        s_to_t = {}
        t_to_s = {}
        
        # Iterate over both strings simultaneously
        for char_s, char_t in zip(s, t):
            # Check if the mapping exists in both directions
            if (char_s in s_to_t and s_to_t[char_s] != char_t) or \
               (char_t in t_to_s and t_to_s[char_t] != char_s):
                return False
            
            # Create or update the mappings
            s_to_t[char_s] = char_t
            t_to_s[char_t] = char_s
        
        # If we finish checking without inconsistencies, return True
        return True

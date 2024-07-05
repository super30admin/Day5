class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        # If the lengths of the strings are different, they cannot be isomorphic
        if len(s) != len(t):
            return False
        
        # Initialize dictionaries to map characters from s to t and from t to s
        s_map = {}
        t_map = {}
        
        # Iterate through the characters of the strings
        for i in range(len(s)):
            s_char = s[i]  # Character from string s at position i
            t_char = t[i]  # Character from string t at position i
            
            # Check if s_char has been mapped before
            if s_char in s_map:
                # If the mapped character does not match t_char, return False
                if s_map[s_char] != t_char:
                    return False
            else:
                # Map s_char to t_char
                s_map[s_char] = t_char
            
            # Check if t_char has been mapped before
            if t_char in t_map:
                # If the mapped character does not match s_char, return False
                if t_map[t_char] != s_char:
                    return False
            else:
                # Map t_char to s_char
                t_map[t_char] = s_char
        
        # If all checks pass, the strings are isomorphic
        return True





# with dictionary and set
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        # If the lengths of the strings are different, they cannot be isomorphic
        if len(s) != len(t):
            return False
        
        # Initialize a dictionary to map characters from s to t
        s_map = {}
        # Initialize a set to track characters already mapped from t
        t_set = set()
        
        # Iterate through the characters of the strings
        for i in range(len(s)):
            s_char = s[i]  # Character from string s at position i
            t_char = t[i]  # Character from string t at position i
            
            # Check if s_char has been mapped before
            if s_char in s_map:
                # If the mapped character does not match t_char, return False
                if s_map[s_char] != t_char:
                    return False
            else:
                # If t_char is already mapped to another character, return False
                if t_char in t_set:
                    return False
                # Map s_char to t_char
                s_map[s_char] = t_char
                # Add t_char to the set of mapped characters
                t_set.add(t_char)
        
        # If all checks pass, the strings are isomorphic
        return True

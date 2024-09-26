class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        char_map = {}
        visited = set()
        
        for index,s_char in enumerate(s):
            t_char = t[index]
            
            # Key Char already mapped, but value does not match the new mapping character
            if s_char in char_map:
                if char_map[s_char] != t_char:
                    return False
                
            # value visited before which means some other key already holds this value
            else:
                if t_char in visited:
                    return False
            
            # Add key,value pair to map and add value to visited
            char_map[s_char] = t_char
            visited.add(t_char)
            
        return True

### Complexity Analysis

# Time Complexity: O(N) --> N is the length of strings; For loop iterates through the string.
# Space Complexity: O(N) --> HashMap + HashSet
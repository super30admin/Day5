class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        words = s.split(" ")
        
        ### Edge Cases
        if len(pattern) != len(words):
            return False
        
        if not pattern:
            return True
        
        pattern_map = {}
        visited = set()
        
        for index,char in enumerate(pattern):
            word = words[index]
            
            # If character is already mapped and the new word does not match existing word
            if char in pattern_map and pattern_map[char] != word:
                return False
            
            # Word has been visisted before i.e it is matched to different character
            elif char not in pattern_map and word in visited:
                return False
            
            else:
                pattern_map[char] = word    # Add to Map
                visited.add(word)           # Add to Set
                
        return True

### Complexity Analysis

# Time Complexity: O(N) --> N = number of words
# Space Complexity: O(N) --> Space occupied by visited set and pattern map
# Approach:
# We use two hashmaps to maintain a bijective mapping: one from pattern to words and another from words to pattern.
# As we iterate over both the pattern and the words in the string, we ensure that each letter in the pattern maps to a unique word and vice versa.
# If any mapping inconsistency occurs, we return False; otherwise, both the mappings are consistent, and we return True.

# Time Complexity: O(n), where n is the length of the pattern (or the number of words in the string).
# Space Complexity: O(n) to store the mappings.
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        # Split the string into words
        words = s.split()
        
        # If lengths are different, return False immediately
        if len(pattern) != len(words):
            return False
        
        # Hashmaps to store the mappings
        char_to_word = {}
        word_to_char = {}
        
        # Iterate over the pattern and the words simultaneously
        for char, word in zip(pattern, words):
            # Check if the mappings are consistent in both directions
            if (char in char_to_word and char_to_word[char] != word) or \
               (word in word_to_char and word_to_char[word] != char):
                return False
            
            # Create or update the mappings
            char_to_word[char] = word
            word_to_char[word] = char
        
        # If no inconsistencies found, return True
        return True

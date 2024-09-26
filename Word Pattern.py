# Example 1: Input: pattern = "abba", str = "dog cat cat dog" Output: true
# Example 2: Input:pattern = "abba", str = "dog cat cat fish" Output: false
"""Approach is similar to isomorphic strings. We use two hashmaps to store the mappings."""

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:

        # Time Complexity = O(n)
        # Space Complexity = O(n) for the two hashmaps

        # Splitting the sentence into words
        words = s.split(" ")

        # If the length is not the same, they can't have the same pattern
        if len(words) != len(pattern):
            return False

        # Two hashmaps to store the mappings
        ch_to_word, word_to_ch = {}, {}

        # Traversing through the pattern and s
        for ch, word in zip(pattern, words):

            # If the value is present but the mapping is wrong
            if ((ch in ch_to_word and ch_to_word[ch] != word) or
                    (word in word_to_ch and word_to_ch[word] != ch)):
                return False

            # Else, create the mapping in both the hashmaps
            ch_to_word[ch] = word
            word_to_ch[word] = ch

        return True
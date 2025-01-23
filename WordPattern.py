# Time Complexity: O(n), where n is the number of characters in the pattern or words in the string `s`.
# Space Complexity: O(k), where k is the number of unique characters in the pattern and unique words in `s`.
# Approach: Used two hash maps to ensure a bijection between the characters in the pattern and the words in the string.

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split()  # Split the string into words
        if len(pattern) != len(words):
            return False  # If lengths are not the same, it's not a match

        char_to_word = {}  # Map to store pattern character to word mapping
        word_to_char = {}  # Map to store word to pattern character mapping

        for char, word in zip(pattern, words):
            # Check if the character is already mapped to a word
            if char in char_to_word:
                if char_to_word[char] != word:
                    return False  # Mismatch in mapping
            else:
                char_to_word[char] = word

            # Check if the word is already mapped to a character
            if word in word_to_char:
                if word_to_char[word] != char:
                    return False  # Mismatch in mapping
            else:
                word_to_char[word] = char

        return True  # If no mismatches found, return True

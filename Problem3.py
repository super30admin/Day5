# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split()
        if len(pattern) != len(words):
            return False

        char_to_word = {}
        word_to_char = {}

        for char, word in zip(pattern, words):
            if char in char_to_word: # Check if the character is already mapped to a word
                if char_to_word[char] != word:
                    return False # Mapped to different words
            else:
                char_to_word[char] = word # Establish new mapping

            if word in word_to_char: # Check if the word is already mapped to a character
                if word_to_char[word] != char:
                    return False # Mapped to different characters
            else:
                word_to_char[word] = char # Establish new mapping

        return True # All checks passed
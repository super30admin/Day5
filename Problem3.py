"""
Leetcode #290 https://leetcode.com/problems/word-pattern/description/
Word Pattern
"""


class Solution:
    """
    Approach:
    - The goal is to determine if the string `s` follows the same pattern as the string `pattern`.
    - To achieve this, we use a dictionary `char_to_word` to map each character in `pattern` to a unique word in `s`. 
      Additionally, a set `word_set` is used to ensure no two characters in `pattern` map to the same word in `s`.
    - Steps:
        1. Split the string `s` into a list of words using `split()`.
        2. Check if the lengths of `pattern` and the list of words are equal. If not, return `False`.
        3. Traverse both `pattern` and the list of words simultaneously using `zip()`.
        4. For each character-word pair:
           - If the character is already in the dictionary:
             - Check if its mapped word matches the current word. If not, return `False`.
           - If the character is not in the dictionary:
             - Check if the word is already mapped to another character using the set. If so, return `False`.
             - Otherwise, add the character-word pair to the dictionary and the word to the set.
        5. If no inconsistencies are found, return `True`.

    Time Complexity:
    - O(K + N), where:
        - K is the total length of the string `s` (for splitting into words).
        - N is the length of the pattern (for iterating through the characters and words).
    - The dominant operation is splitting the string and iterating through the pattern and words.

    Space Complexity:
    - O(N), where N is the length of the pattern:
        - The dictionary `char_to_word` and the set `word_set` each store up to N elements.

    """

    def wordPattern(self, pattern: str, s: str) -> bool:
        # Split the string `s` into words
        words = s.split()

        # If the number of words does not match the length of the pattern, return False
        if len(words) != len(pattern):
            return False

        # Dictionary to map characters in the pattern to words
        char_to_word = {}
        # Set to track words that have already been mapped
        word_set = set()

        # Iterate through both the pattern and words simultaneously
        for char, word in zip(pattern, words):
            # If the character is already mapped, check for consistency
            if char in char_to_word:
                if char_to_word[char] != word:
                    return False  # Inconsistent mapping
            else:
                # If the word is already mapped to another character, return False
                if word in word_set:
                    return False
                # Add the mapping and the word to the set
                char_to_word[char] = word
                word_set.add(word)

        # If no inconsistencies are found, the pattern matches the string
        return True

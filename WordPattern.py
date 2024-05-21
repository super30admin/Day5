# Time Complexity : O(n), where n is the number of words in the string
# Space Complexity : O(1)
# This function checks if a pattern matches a word sequence in a string by using a dictionary to map pattern characters to words and a set to ensure unique mappings. It iterates through the pattern and words, validating one-to-one correspondence. If any mapping conflicts are found, it returns False. Otherwise, it returns True.
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        if not pattern or not s:
            return False

        words = s.split()
        if len(pattern) != len(words):
            # Number of words in the string should equal the number of characters in the pattern
            return False

        char_to_word = {}
        word_set = set()
        for i in range(len(words)):
            if pattern[i] not in char_to_word: # Key is not present in the map
                if words[i] in word_set:
                    return False  # Word is already mapped to another character
                char_to_word[pattern[i]] = words[i]
                word_set.add(words[i])
            elif char_to_word[pattern[i]] != words[i]:
                # Key is the same, but the associated word is different
                return False

        return True

# Example 1
solution = Solution()
pattern = "abba"
s = "dog cat cat dog"
print(solution.wordPattern(pattern, s))  # Output: True

# Example 2
pattern = "abba"
s = "dog cat cat fish"
print(solution.wordPattern(pattern, s))  # Output: False

# Example 3
pattern = "aaaa"
s = "dog cat cat dog"
print(solution.wordPattern(pattern, s))  # Output: False

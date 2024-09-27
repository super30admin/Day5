# Time Complexity : O(n), where n is the number of characters in the pattern or number of words in the string
# Space Complexity : O(m), where m is the number of unique words in the string
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        pattern = list(pattern)

        words = s.split(" ")

        if len(pattern) != len(words):
            return False

        mapping = {}
        occurred = set()

        for char, word in zip(pattern, words):
            if char in mapping:
                if mapping[char] != word:
                    return False

            elif word in occurred:
                return False

            mapping[char] = word
            occurred.add(word)

        return True

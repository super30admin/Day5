"""
Time complexity: O(N) - Iterating through the word list and the pattern list which of the same size N
Space complexity: O(N) to store the mappings of the word and the pattern of size N
code execution: complete
No doubts
Explaination: Edge case:  if the length of the sentence or the pattern is zero or if both are not equal
map each word of the string with each charater of the pattern. If pattern mismatch, return False else return True

"""
from collections import defaultdict


class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        if len(pattern) == 0 or len(str) == 0:
            return False
        words = str.split(" ")
        if len(words) != len(pattern):
            return False
        hashmap_pattern = defaultdict()
        hashmap_words = defaultdict()

        for i in range(len(pattern)):
            if pattern[i] not in hashmap_pattern:
                hashmap_pattern[pattern[i]] = words[i]
            else:
                if hashmap_pattern[pattern[i]] != words[i]:
                    return False

        for j in range(len(words)):
            if words[j] not in hashmap_words:
                hashmap_words[words[j]] = pattern[j]
            else:
                if hashmap_words[words[j]] != pattern[j]:
                    return False
        return True

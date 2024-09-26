# Time Complexity: O(n), where n is num of chars in pattern (or) no of words in s
# Space Complexity: O(k), where k is num of unique words in string s (p_map has space complexity of O(1) since it can store max of 26 alphabets)
# Did this code successfully run on Leetcode: Yes

# Solution:

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        if not pattern and not s:
            return True

        words = s.split(" ")
        if len(pattern) != len(words):
            return False

        # A dictionary to store char to word mapping and a set to store unique words of s 
        p_map = dict()
        s_set = set()

        for i in range(len(words)):
            word = words[i]
            char = pattern[i]

            if char in p_map:
                # check char to word mapping
                if p_map[char] != word:
                    return False
            else:
                # If word is present in set, it has already been mapped to another char
                if word in s_set:
                    return False

                p_map[char] = word
                s_set.add(word)

        return True
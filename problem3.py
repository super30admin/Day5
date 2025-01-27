# Time Complexity : O(N)
# Space Complexity : O(1) # since space is limited to 26 characters

# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO

# Your code here along with comments explaining your approach

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        char_to_word = {}
        word_to_char = {}

        s_words = s.split()

        if len(pattern) != len(s_words):
            return False
        
        for i in range(len(pattern)):
            if pattern[i] not in char_to_word and s_words[i] not in word_to_char:
                char_to_word[pattern[i]] = s_words[i]
                word_to_char[s_words[i]] = pattern[i]
            else:
                if pattern[i] in char_to_word and char_to_word[pattern[i]] != s_words[i]:
                    return False
                if s_words[i] in word_to_char and word_to_char[s_words[i]] != pattern[i]:
                    return False
        
        return True


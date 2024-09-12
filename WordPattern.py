'''
    Time Complexity:
        O(n) (when n = length of pattern string)

    Space Complexity:
        O(n) (when n = length of pattern string)

    Did this code successfully run on LeetCode?:
        Yes

    Problems faced while coding this:
        None

    Approach:
        Create a list of space strings from s.
        If length of pattern != length of this list, return False
        Else, create a word-to-char map and a chat-to-word map.
        Now loop through the pattern by its indices and check equivalance in
        the maps according to the condition at L31 in this code snippet.
'''
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        word_list = s.split(' ')
        if len(pattern) != len(word_list):
            return False

        word_map = {}
        char_map = {}

        for idx, char in enumerate(pattern):
            if (char in char_map and char_map[char] != word_list[idx]) or (word_list[idx] in word_map and word_map[word_list[idx]] != char):
                return False
            char_map[char] = word_list[idx]
            word_map[word_list[idx]] = char
        return True

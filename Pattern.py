#time complexity : O (1)
# space complexity: O(1)
# Runs on leetcode: Yes


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        pattern_array = {}
        s_dict = {}
        s_list = s.split(" ")
        if len(pattern) != len(s_list): return False
        for i in range(len(pattern)):
            pattern_char = pattern[i]
            s_word = s_list[i]

            if pattern_char not in pattern_array:
                pattern_array[pattern_char] = s_word
            else:
                if pattern_array.get(pattern_char) != s_word: return False

            if s_word not in s_dict:
                s_dict[s_word] = pattern_char
            else:
                if s_dict.get(s_word) != pattern_char: return False

        return True
# TIme : O(n) due to split else O(1)
# Space: O(n)
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        dict_letter = {}
        dict_words = {}
        s_arr = s.split(" ") # time: O(n), space: O(n)
        if len(pattern) != len(s_arr):
            return False
        for i in range(0, len(pattern)): # time O(n)
            if pattern[i] in dict_letter: # time O(1)
                if dict_letter.get(pattern[i]) != s_arr[i]: #time O(1)
                    return False
            else:
                dict_letter[pattern[i]] = s_arr[i] # time O(1), space: O(26 char * k) k: longest word
            if s_arr[i] in dict_words:
                if dict_words.get(s_arr[i]) != pattern[i]:
                    return False
            else:
                dict_words[s_arr[i]] = pattern[i] # time O(1), space: O(26 chars)
        return True
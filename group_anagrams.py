from typing import List

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        count_dictionary = {}  # Fixed initialization

        def count_chars(string):
            char_count = {}

            string_list = sorted(string)
            for char in string_list:
                if char in char_count:
                    char_count[char] += 1
                else:
                    char_count[char] = 1
            
            return tuple(char_count.items())

        for string in strs:
            char_count = count_chars(string)

            if char_count in count_dictionary:
                count_dictionary[char_count].append(string)
            else:
                count_dictionary[char_count] = [string]

        return list(count_dictionary.values())

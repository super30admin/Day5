# Time Complexity:O(n * k log k), where n is the number of words and k is the length of the longest word.
# Space Complexity: O(n) [allocated space in result[] for each string present in the list strs]

from collections import defaultdict


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dictionary = defaultdict(list)       #  create a dictionary key : [values] 
        result = []                          # empty list
        for i in range(len(strs)):
            sorted_word = ''.join(sorted(strs[i]))  # sort the letters in the word (Ex: bat, ['a', 'b' , 't]) and join the letters(abt)
            dictionary[sorted_word].append(strs[i])

        for i in dictionary.values():
            result.append(i)
        return result




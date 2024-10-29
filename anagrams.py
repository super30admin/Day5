# The code defines a function to group anagrams from a list of strings.
# Anagrams are strings that can be formed by rearranging the letters of another string using each letter exactly once.
# A defaultdict named 'res' is used to collect groups of anagrams, where each key is a tuple representing the character count of a string.
# The function iterates through each string 's' in the given list 'strs':
#   - It initializes a list 'count' of length 26 (for each letter of the alphabet) to zero.
#   - For each character 'c' in the string 's', it increments the corresponding index in the 'count' list, which is derived by subtracting the ASCII value of 'a' from the ASCII value of 'c'.
#   - The 'count' list is then converted to a tuple (to be hashable and used as a key in 'res') and the string 's' is appended to the list of strings at this key.
# The function finally returns a list of these grouped anagrams by converting the values of the defaultdict 'res'.
# Time Complexity (TC):
#   - The function operates in O(n * k) time complexity, where n is the number of strings in 'strs' and k is the maximum length of a string. This accounts for iterating through each string and counting each character.
# Space Complexity (SC):
#   - The space complexity is O(n * k), considering the storage for the dictionary and the lists of anagrams. The count lists and tuples also contribute, but their size is constant (26) and independent of the input size.


from collections import defaultdict
from typing import List

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = defaultdict(list)
        for s in strs:
            count = [0] * 26
            for c in s:
                count[ord(c) - ord('a')] += 1
            res[tuple(count)].append(s)
        return list(res.values())  # Convert dict_values to a list

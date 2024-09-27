# O(w * n * log(n)) time where w is no.of words and n is length of longest word
# O(wn) space
class Solution:
    def groupAnagrams(self, strs):
        anagrams = {}
        for string in strs:
            sorted_string = ''.join(sorted(string))
            if sorted_string not in anagrams:
                anagrams[sorted_string] = []
            anagrams[sorted_string].append(string)
        return list(anagrams.values())

        
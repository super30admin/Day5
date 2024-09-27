# Time Complexity : O(nm), where n is the number of words and m is the average length of a word
# Space Complexity : O(nm)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def generateKey(self, word):
        prime_numbers = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
                         103]

        prime_product = 1

        for char in word:
            prime = prime_numbers[ord(char) - ord('a')]
            prime_product *= prime

        return prime_product

    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if strs == [""]:
            return [[""]]
        elif len(strs) == 1:
            return [strs]

        anagram = {}

        for word in strs:
            key = self.generateKey(word)

            if key in anagram:
                anagram[key].append(word)

            else:
                anagram[key] = [word]

        return list(anagram.values())

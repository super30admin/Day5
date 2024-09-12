# Group Anagrams
# Time Complexity: O(nk)
# k - average length of string
# n - number of strings 
# Space Complexity - O(nk)
# Code ran successfully on leetcode
# Using the idea that product of prime nos is unique
# Declare an array of first 26 prime nos and take the diference in ascii
from typing import List
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        prime_nos = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 
                     31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        map_product_to_word = {}
        for word in strs:
            product  = 1
            for ch in word:
                product *= prime_nos[ord(ch) - ord('a')]
            # If product is present in hashmap append
            if product in map_product_to_word:
                map_product_to_word[product].append(word)
            # If not present, create a list
            else:
                map_product_to_word[product] = [word]
        return map_product_to_word.values()

s = Solution().groupAnagrams(["eat","tea","tan","ate","nat","bat"])
print(s)       
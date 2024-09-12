# Time Complexity : O(nk)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram_dict = {}

        primes = [2, 3, 5, 7, 11,
                  13, 17, 19, 23, 29,
                  31, 37, 41, 43, 47,
                  53, 59, 61, 67, 71,
                  73, 79, 83, 89, 97, 103]

        for elem in strs:
            primeVal = 1
            for char in elem:
                primeVal = primeVal * primes[(ord(char)) - ord('a')]
            if primeVal in anagram_dict:
                anagram_dict[primeVal].append(elem)
            else:
                anagram_dict[primeVal] = [elem]
        return anagram_dict.values()
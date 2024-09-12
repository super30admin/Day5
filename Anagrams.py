# // Time Complexity : O(n)
# // Space Complexity : O(nk) => n is the length of array and k is the length of each string
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No

import collections


class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        def hashmapImpl():

            result = collections.defaultdict(list)

            for word in strs:
                sorted_word = ''.join(sorted(word))
                result[sorted_word].append(word)

            return result.values()

        def primeMap():

            result = collections.defaultdict(list)
            primeNumbers = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,
                            53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127]

            for word in strs:
                product = 1
                for char in word:
                    # print(ord(char) - ord('a'))
                    product = product * primeNumbers[ord(char) - ord('a')]
                result[product].append(word)
            return result.values()

        return primeMap()

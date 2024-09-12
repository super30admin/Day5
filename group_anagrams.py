"""
Problem: Given an array of strings, group anagrams together.
Leetcode: https://leetcode.com/problems/group-anagrams/
Example:
    Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
    Output: [ ["ate","eat","tea"], ["nat","tan"], ["bat"] ]
    Note: All inputs will be in lowercase. The order of your output does not matter.
Time Complexity: O(NK), where N is the length of strs, and K is the maximum length of a string in strs.
    Counting each string is linear in the size of the string, and we count every string.
Space Complexity: O(NK), the total information content stored in ans.
Leetcode: Pass
Any problems: No
"""


class Solution:
    def groupAnagrams(self, strs):
        # Base Case
        if strs is None or len(strs) == 0:
            return -1

        # Define hashmap to map the product of the string with the strings having same product
        smap = {}

        finalList = []

        # Traverse through each string from given string
        for s in strs:
            primeProduct = self.calculatePrimeProduct(s)
            if primeProduct not in smap.keys():
                smap[primeProduct] = []
            smap.get(primeProduct).append(s)

        # Traverse through the hashmap to put values into list
        for k, v in smap.items():
            finalList.append(v)
        return finalList

    # Helper function to calculate product of a given string
    def calculatePrimeProduct(self, s):
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 67, 71, 73, 79, 83, 89, 97, 101, 103]
        product = 1

        for i in range(len(s)):
            c = s[i]
            product = product * (primes[ord(c) - ord('a')])
        return product


obj = Solution()
print(obj.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))
print(obj.groupAnagrams([""]))
print(obj.groupAnagrams(["a"]))
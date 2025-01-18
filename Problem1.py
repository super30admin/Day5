"""
Leetcode #49 : https://leetcode.com/problems/group-anagrams/description/
Group Anagrams
"""

from collections import defaultdict
import string
from typing import List


class Solution:
    """
    Brute Force Approach:
    Two strings are anagrams if they contain the same letters with the same frequencies,
    but the order of letters can be different. For example, "eat" and "ate" are anagrams.

    This implementation uses a helper function to compare two strings for anagram status.
    A nested loop is used to compare all pairs of strings, grouping anagrams together.
    Time Complexity: O(N^2 * M),
    where N is the number of strings and M is the average length of the strings.
    Space Complexity: O(M*N)
    """

    def compareStrings(self, string1: str, string2: str) -> bool:
        """
        Helper function to check if two strings are anagrams by comparing their sorted forms.

        Args:
        string1 (str): First string.
        string2 (str): Second string.

        Returns:
        bool: True if the strings are anagrams, False otherwise.
        """
        return sorted(string1) == sorted(string2)

    def groupAnagramsBruteForce(self, strs: List[str]) -> List[List[str]]:
        """
        Groups anagrams from the input list of strings.

        Args:
        strs (List[str]): List of strings to group.

        Returns:
        List[List[str]]: Grouped anagrams as a list of lists.
        """
        result = []  # List to hold groups of anagrams

        # Edge case: if the input list is empty, return an empty list
        if not strs:
            return result

        visited = set()  # Set to keep track of strings already grouped

        for i in range(len(strs)):
            if i in visited:
                continue  # Skip if the string has already been processed

            group = [strs[i]]  # Start a new group with the current string
            visited.add(i)  # Mark the string as visited

            for j in range(i + 1, len(strs)):
                if j not in visited and self.compareStrings(strs[i], strs[j]):
                    # Add the anagram to the current group
                    group.append(strs[j])
                    visited.add(j)  # Mark the string as visited

            result.append(group)  # Add the completed group to the result

        return result

    """
    Optimized Approach:
    The idea is to find a unique representation for each group of anagrams.
    By assigning a prime number to each letter of the alphabet, the product of the prime numbers
    for the letters in a string serves as a unique key for all anagrams.
    This approach uses a dictionary (hashmap) where keys are the prime products, and values are
    lists of strings that are anagrams of each other.
    Time Complexity: O(N * M),
     where N is the number of strings in the input list,
     and M is the average length of the strings.
    Space Complexity: O(N * M), dominated by the space required to store the output.
    """

    def generatePrimemap(self) -> dict:
        # create a list of first 26 prime numbers
        primes = []
        num = 2

        while len(primes) <= 26:

            is_prime = all(num % p != 0 for p in primes)

            if is_prime:
                primes.append(num)

            num += 1

        letters = string.ascii_lowercase  # output abcdefghijklmnopqrstuvwxyz
        prime_map = {letter: number for letter, number in zip(letters, primes)}
        return prime_map

    def compute_key(self, s: str) -> int:
        """
        Compute the key for a string by taking the product of the prime numbers
        corresponding to each character.
        """
        # Mapping of characters to prime numbers
        # prime_map = {
        #     'a': 2, 'b': 3, 'c': 5, 'd': 7, 'e': 11, 'f': 13, 'g': 17, 'h': 19,
        #     'i': 23, 'j': 29, 'k': 31, 'l': 37, 'm': 41, 'n': 43, 'o': 47, 'p': 53,
        #     'q': 59, 'r': 61, 's': 67, 't': 71, 'u': 73, 'v': 79, 'w': 83, 'x': 89,
        #     'y': 97, 'z': 101
        # }
        prime_map = self.generatePrimemap()
        product = 1
        for char in s:
            product *= prime_map[char]
        return product

    def groupAnagramsOptimized(self, strs: List[str]) -> List[List[str]]:

        # initialize result
        res = []

        # Dictionary to store groups of anagrams
        anagram_map = defaultdict(list)

        # edge case
        if not strs:
            return res

        for anagram_str in strs:
            key = self.compute_key(anagram_str)  # genarte key
            anagram_map[key].append(anagram_str)  # add to map

        # transform the values of map into result list
        return list(anagram_map.values())

    """
    Another Optimized Approach:
    Sorting a string provides a unique representation of its characters. 
    By using the sorted string as the key in a hashmap, we can group anagrams efficiently.

    Time Complexity: O(M * N * logN), where M is the number of strings 
    and N is the average length of each string (sorting each string takes O(N * logN)).
    Space Complexity: O(M * N), as the hashmap stores all the strings and keys.
    """

    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        res = []
        # Edge case
        if not strs:
            return res

        # hash map to strore the anagram grouping
        anagram_map = defaultdict(list)

        # iterate through each string in strs and store them in map
        for str in strs:
            anagram_map[''.join(sorted(str))].append(str)

        # onec hashmap is created, transform value of hashmap into list and return
        return list(anagram_map.values())

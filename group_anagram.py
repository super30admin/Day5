"""
Brute force approach: Find all the arrangements of each word and check if they are present in the string array.
If yes, then add to list of list data structure. Time complexity: n!*n to find all the arrangements of each word and
O(n*m) to search for each arrangement, where m is the number of arrangements and n is the total words in the string
array. So total time complexity: n! * n * n * m.

1st optimal approach: for each word store its anagram in hash map where key is the sorted string and value is the list
of anagram of each word.
Why use hash map?
Anagrams of each word could be stored in a list or linked list. However, a hash map allows for efficient
searching to determine if a word's anagram is present.

Time complexity: k log (k), where k is the average length of strings, for sorting one string. n * k log (k ) to sort
all strings. To store that word inside the hash map, each character of the string is accessed to find hash value. Thus
adding O(k).The final time complexity is: n * (k log (k) + O(k))
Space complexity: O(1)

2nd optimal approach:
The 1st optimal approach can be more optimized by avoiding the sorting. Instead of sort the prime product of each
string can be calculated and strings sharing the same prime product are anagrams. Assigning a prime number is O(1),
since prime numbers are stored in an array of 26 length.
Takes: O(n*k) time.
Space complexity: O(1)

"""
from typing import List


class Solution:

    def groupAnagrams_approach2(self, strs: List[str]) -> List[List[str]]:
        """
      :param strs: list of string
      :return: list of anagram
      """
        prime_numbers = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
                         97, 101]

        ans = []
        hmap = {}
        for s in strs:

            prime_product = 1
            for ch in s:
                prime_product = prime_product * prime_numbers[(ord(ch) - ord("a"))]

            if prime_product not in hmap:
                hmap[prime_product] = []

            hmap[prime_product].append(s)

        for k, v in hmap.items():
            ans.append(v)

        return ans

    def groupAnagrams_approach1(self, strs: List[str]) -> List[List[str]]:
        """
       :param strs: list of string
       :return: list of anagram
       """
        hmap = {}
        ans = []

        for s in strs:
            sorted_str_lst = sorted(s)
            sorted_str = "".join(sorted_str_lst)
            if sorted_str not in hmap:
                hmap[sorted_str] = []

            hmap[sorted_str].append(s)

        for k, v in hmap.items():
            ans.append(v)

        return ans

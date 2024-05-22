"""
Hashing-1

Problem 1:
Given an array of strings, group anagrams together.

Example: Input: ["eat", "tea", "tan", "ate", "nat", "bat"], 
Output: [ ["ate","eat","tea"], ["nat","tan"], ["bat"] ]

Note: All inputs will be in lowercase. The order of your output does not matter.

Time Complexity : O(nk) where k is length of the word and n is no of words in list
Space Complexity : O(n) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Your code here along with comments explaining your approach:
Two approaches: 
1. HashMap - O(nklogk) where for n strings we are apply sorting that takes klogk where k is length of the string. 
The approach is we iterate over the input and sort the word and join them back and check if it exists in hash_map if yes, we append the current word to it else we initialize new list and at the end we return values of hash_map.
2. Ascii value sum/product doesn't work because same sum/product can be formed with different chars so we go with math rule i.e., product of prime numbers are unique. Also while taking product of prime numbers in java make sure we take double since integer overflow might happen.
The approach is we iterate over the input and find the prime product of the word and check if it exists in hash_map if yes we append the word to this values list else we assign a new list to this product and we return values of this hash_map.
Idea behind this approach is to decrease the sorting T.C to constant time using prime product.
"""

# Approach 1
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if not strs or len(strs) == 0:
            return []

        hash_map = {}

        for word in strs:
            sorted_word = sorted(word)
            if sorted_word not in hash_map:
                hash_map[sorted_word] = []
            hash_map[sorted_word].append(word)

        return hash_map.values()
    
# Approach 2
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        def prime_product(word):
            primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
            product = 1
            for i in range(len(word)):
                product *= primes[ord(word[i]) - ord('a')]

            return product
        
        if not strs or len(strs) == 0:
            return []

        hash_map = {}

        for word in strs:
            word_prime_product = prime_product(word)
            if word_prime_product not in hash_map:
                hash_map[word_prime_product] = []
            hash_map[word_prime_product].append(word)

        return hash_map.values()
        
        
#Time Complexity: O(nk) where k is length of word and n is number of words
#Space Complexity: O(n)
#Did it run and passed all test cases on leetcode: Yes
#Difficulties:

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        def prime_product(word):
            result = 1
            primes = [2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103]
            for char_1 in word:
                prime = primes[ord(char_1) - ord('a')]
                result = result * prime
            return result
        #create hashmap for each word
        anagram_data = {}
        for word in strs:
            prime_product_val = prime_product(word)
            if prime_product_val in anagram_data:
                anagram_data[prime_product_val].append(word)
            else:
                anagram_data[prime_product_val] = [word]
        
        grouped_anagrams = []
        for key in anagram_data:
            grouped_anagrams.append(anagram_data[key])
        return grouped_anagrams
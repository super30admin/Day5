# Leetcode 149. Group Anagrams

# Time Complexity :  O(nk) where n is the size of the array and k is the size of each word in the array

# Space Complexity : O(nk) where n is the size of the array and k is the size of each word in the array

# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: Assign first 26 prime numbers to a letter. The product of prime numbers is unique.
# All the annagrams will have same product.
# Using a hashmap we can store the product as key and anagrams list as value. Iterate through hashmap and append
# the anagrams to the list if the product is already present. Else add it. Return hashmap values as a list

# Your code here along with comments explaining your approach

class Solution:
    # Function to calcuate character prime product
    def calculatePrime(self, word):
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41,
                  43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        count = 1
        for letter in word:
            # ascii value of the letter - ascii value of a i.e 97 gives index of prime number for that letter
            index = ord(letter)-ord('a')
            count = primes[index]*count
        return count

    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashmap = dict()
        for word in strs:
            temp = self.calculatePrime(word)
            if temp not in hashmap:
                hashmap[temp] = []
            hashmap[temp].append(word)
        return list(hashmap.values())

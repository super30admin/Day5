# Group Anagrams
'''
Leetcode all test cases passed: Yes
Solution:
    primeProduct(self, word):
        k is no of characters in word
        Space Complexity: O(1)
        Time Complexity: O(k)
    groupAnagrams(self, strs):
        n is no of words in strs
        Space Complexity: O(n)
        Time Complexity: O(n * k)
'''

class Solution:
    def primeProduct(self, word):
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        product = 1
        for w in word:
            product *= ord(w) * primes[ord(w) - ord('a')] 
        return product
    def groupAnagrams(self, strs)
        res = {}
        for word in strs:
            primeProduct = self.primeProduct(word)
            if primeProduct not in res:
                res[primeProduct] = []
            res[primeProduct].append(word)
            
        
        return [res[key] for key in res]

# Time Complexity
# O(N^2)
# Space Complexity
# O(n)

# Approach :

# product of primes will always return a unique number
# take each word in the array and based on ascii value find the difference between that char ascii value and ascii of 'a'
# create a prime no array of 26, and assign each character a prime number and calculate its product and that product becomes the key in the hasmap and the word becomes the value

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashMapString = {}
        if strs == [""]:
            return [[""]]

        for i in range(len(strs)):
            product = self.productPrime(strs[i])
            if product not in hashMapString:
                hashMapString[product] = []
            hashMapString[product].append(strs[i])

        return hashMapString.values()

    def productPrime(self, strs):

        primeDict = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31,
                     37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        product = 1

        for i in range(len(strs)):
            product = product*(primeDict[ord(strs[i])-ord('a')])

        return product

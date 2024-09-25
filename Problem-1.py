'''
    Time Complexity: O(n.k)
    Space Complexity
    Approach: Prime Product Hashing. 
    Give Prime numbers to each characters and use their products as keys. 
    Store all the anagrams in an array corresponding to the keys.
'''
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagramMap = {}

        for string in strs:
            prodHash = 1
            for char in string:
                charHash = self.getHash(char)
                prodHash *= charHash
                
            if prodHash not in anagramMap:
                anagramMap[prodHash] = [string]
            else:
                anagramMap[prodHash].append(string)

        return anagramMap.values()
    
    def getHash(self, char):
        # primeNumbers = self.primeNumbersGenerator()
        primeNumbers = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        # print(primeNumbers)
        index = ord(char) - ord('a')
        return primeNumbers[index]
    
    def primeNumbersGenerator(self):
        primeNumbers = []

        num = 2
        while len(primeNumbers) < 26:
            factors = 0
            isAPrimeNumber = True
            
            for i in range(2, num//2 + 1):
                if num % i == 0:
                    isAPrimeNumber = False
                    break

            if isAPrimeNumber:
                primeNumbers.append(num)
            
            num += 1

        return primeNumbers     
        
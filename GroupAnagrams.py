# Time Complexity : O(nk) where n is the number of strings and k is the average length of each string
# Space Complexity : O(1) #At max 26 values in map
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :No

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        def calculatePrimeProduct(s:str) -> int : 
            prime_numbers = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
            product = 1
            for char in s :
                product *= prime_numbers[ord(char)-ord('a')]
            return product

        anagramMap = {}

        for s in strs:
            primeProduct = calculatePrimeProduct(s)
           
            if primeProduct not in anagramMap:
                anagramMap[primeProduct] = [s]
            else:
                anagramMap[primeProduct].append(s)
                
        return list(anagramMap.values())


        
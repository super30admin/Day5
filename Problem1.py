#Time Complexity: O(n * k) where n is the number of strings in the list and k is the average length of a string
#Space Complexity: O(n) where n is length of the string

#Accepted on Leetcode 

#Approach: 
#Initiate hashmap
#Iterate over each string, get the string letters's corresponding product of primes 
#(where each letter from a-z corresponds to a 0-26th prime number depending on it's ascii value)
#Check if key exists in hashmap, where key is the prime number product of all letters in the string
#If key exists in hashMap append string to the list at that key
#Else add key to list and initiate value as list with [currentString]
#At the end, list comprised of each list in the hashMap



class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        primeNumbersList = self.computePrimeNumbers() #[2, 3, 5 ...]
        anagramHashMap = {}
        
        for strVal in strs:
            hashedStrVal = 1
            for letter in strVal:
                corresponedingPrimeNumIdx = ord(letter) - 97
                correspondingPrimeNum = primeNumbersList[corresponedingPrimeNumIdx]
                hashedStrVal *= correspondingPrimeNum
            if hashedStrVal in anagramHashMap:
                anagramHashMap[hashedStrVal].append(strVal) # it will be a list
            else:
                anagramHashMap[hashedStrVal] = [strVal]

        return list(anagramHashMap.values())


    #Returns prime numbers till 26
    def computePrimeNumbers(self):
        return [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        

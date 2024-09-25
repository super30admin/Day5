# Time Complexity : O(nk)   - we are traversing through the list of strings and finding the prime product of every string by traversing through each string seperately
# Space Complexity : O(1)   - we are using constant space without having extra space.
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No 


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        
        hashmap = {}     #create a hashmap
        for i in strs:
            primeprod = self.primeprod(i)   #traverse through the array of strings and create a primeprod value for every string in the array and check whether the primeprod already exists in the hashmap, or else create an array for the specific primeproduct or else append the strings to the list specific to that particular primeproduct (always the same for anagrams)
            if primeprod not in hashmap:
                hashmap[primeprod] = []
            hashmap[primeprod].append(i) 
            
        return [hashmap[i] for i in hashmap]  #return all the arrays specific to prime-products present in the hashmap

    def primeprod(self, char): #function to calculate the prime product
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41,
                  43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101] #26 prime numbers are taken as there are 26 alphabets
        prod = 1
        for c in char:
            prod *= ord(c) * primes[ord(c)-ord('a')]  #the difference between the current character and the character 'a' will give the index of prime numbers to which it must be multiplied
        return prod  #now return the prime product of the string
        
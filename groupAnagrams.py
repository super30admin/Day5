"""
Intuition: 

Method 1:Use hashmap. Sort each word so seraching becomes easy. 
Method 2:Use hashmap. Dont sort. Use the hashvalue itself to search.
For both techniques, to get the hashvalue of the word, multiple a prime form factor with the ASCII of the character.
#####################################################################
Method 1
Time Complexity : O(W*C^2 log C), where W = number of words, C = average number of characeters in a word
Space Complexity : O(W*C) * O(W*C) = 2*O(W*C)  = O(W*C) where W = number of words, C = average number of characeters in a word
#####################################################################
Method 2
Time Complexity : O(W), where W = number of words
Space Complexity : O(W*C) * O(W*C) = 2*O(W*C)  = O(W*C) where W = number of words, C = average number of characeters in a word
#####################################################################
"""
############
#Method 1
class Solution:
    def groupAnagrams(self, words: List[str]) -> List[List[str]]:
        if len(words) == 0 or words == None:
            return []
        hashMap = {}
        for word in words:
            sortedWord = ''.join(sorted(word))
            hashValue = self.getHash(sortedWord)
            if hashValue not in hashMap:
                hashMap[hashValue] = []
            hashMap[hashValue].append(word)
        
        return hashMap.values()

    def getHash(self, word):
        hashValue = 1
        primes = [2,3,5,7,11,13,17,19,23,29,31,37, 41, 43,47,53,59,67, 71, 73, 79, 83, 89, 97, 101, 103]
        for char in word:
            hashValue = hashValue * primes[ord(char) - ord('a')]
        print(hashValue)
        return hashValue


############
#Method 2
class Solution:
    def groupAnagrams(self, words: List[str]) -> List[List[str]]:
        if len(words) == 0 or words == None:
            return []

        hashMap = {}
        for word in words:
            hashValue = self.getHash(word)
            if hashValue not in hashMap:
                hashMap[hashValue] = []
            hashMap[hashValue].append(word)
        
        return hashMap.values()

    def getHash(self, word):
        hashValue = 1
        primes = [2,3,5,7,11,13,17,19,23,29,31,37, 41, 43,47,53,59,67, 71, 73, 79, 83, 89, 97, 101, 103]
        for char in word:
            hashValue = hashValue * primes[ord(char) - ord('a')]
        return hashValue
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashmap = dict()
        for word in strs:
            sortedWord = self.hashing(word)
            # sortedWord = ''.join(sorted(word))
            if not sortedWord in hashmap:
                hashmap[sortedWord] = []
            hashmap[sortedWord].append(word)
        return hashmap.values()
    
    def hashing(self, word : str):
        result = 1
        primes = [2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101]
        for i in word:
            result = result*primes[ord(i)-97]
        return result

# this implementation takes O(nm) complexity where n is the number of words and m is the maximum no. of characters.
        
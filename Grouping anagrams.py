# TC-O(n*k)
# SC-O(n)
class Solution:
    def Prime(self, s):
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        result = 1
        for x in range(len(s)):
            result = result * primes[ord(s[x]) - ord('a')]
        return result

    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        hashmap = {}
        for s in strs:
            primekey = self.Prime(s)
            if (primekey not in hashmap):
                hashmap[primekey] = []
            hashmap[primekey].append(s)
        return hashmap.values()


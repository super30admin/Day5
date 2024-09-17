class Solution:
    def groupAnagrams(self, strs) :

        if strs == None or len(strs) == 0:
            return []

        hashmap = {}
        primeProduct = 1

        for strings in strs:
            primeProduct = self.prime_product(strings)
            if primeProduct not in hashmap.keys():
                hashmap[primeProduct] = []
            hashmap[primeProduct].append(strings)

        return hashmap.values()

    def prime_product(self, strings):
        prime = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,
                 103]

        primeProduct = 1
        for i in range(len(strings)):
            primeProduct *= prime[ord(strings[i]) - ord('a')]

        return primeProduct

sol = Solution()
input_string = ["tea","eat","bat","tan","tab","ate","nat","abt","mat"]
print(sol.groupAnagrams(input_string))
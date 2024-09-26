class Solution:
    def groupAnagrams(self, strs):
        dic = dict()

        for i in strs:
            prime_value = self.calculatePrimes(i)

            if prime_value not in dic:
                dic[prime_value] = [[i]]

            else:
                dic[prime_value].append([i])

        print(list(dic.values()))

    def calculatePrimes(self, str):
        Primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 33, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 83, 89, 97]
        result = 1

        for letter in str:
            result = result * Primes[(ord(letter) - ord('a'))]

        return result









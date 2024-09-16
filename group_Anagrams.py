#Time Complexity : O(NK), where K is the length of each string and N is the length of the List.
# Space Complexity = O(1)
# Yes it ran on Leetcode.



class Solution(object):
    def groupAnagrams(self, strs):
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]

        dic = {}

        for word in strs:
            if self.CalculatedP(word, primes) not in dic:
                dic[self.CalculatedP(word, primes)] = [word]
            else:
                dic[self.CalculatedP(word, primes)].append(word)

        res = []

        for i in dic.values():
            res.append(i)
        return res

    def CalculatedP(self, word, primes):
        mult = 1

        for char in word:
            mult = mult * primes[ord(char) - ord('a')]

        return mult
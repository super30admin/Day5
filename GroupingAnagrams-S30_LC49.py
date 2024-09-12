# TC = O(nk) where n is length of strs and k is avg length of each string in strs.
# SC = O(n)
# Leetcode submission successful.
class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        # Even if we write code to generate prime numbers, it can be considered that its TC, SC is constant
        # as we want only the first 26 prime numbers.
        l_prime_nums = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        prime_prod = []
        for j in range(len(strs)):
            prod = 1
            for k in range(len(strs[j])):
                prod *= l_prime_nums[ord(strs[j][k]) - ord('a')]
            prime_prod.append(prod)

        map = {}
        for i in range(len(prime_prod)):
            if prime_prod[i] in map:
                map[prime_prod[i]].append(strs[i])
            else:
                map[prime_prod[i]] = [strs[i]]

        out = []
        for key in map:
            out.append(map[key])

        return out
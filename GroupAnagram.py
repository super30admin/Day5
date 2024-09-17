class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        # Solution 1 - time complexity nklog(k) , Space complexity - O(n)
        # hashmap = {}
        # for i in strs:
        #     t = i
        #     i = "".join(sorted(i))
        #     if i not in hashmap:
        #         hashmap[i] = []
        #     hashmap[i].append(t)
        # return [hashmap[i] for i in hashmap]

        # Solution 2 Prime Product - Time complexity (nk) , Space complexity - O(n)

        result = {}
        for char in strs:
            primeprod = self.primeprod(char)
            if primeprod not in result:
                result[primeprod] = []
            result[primeprod].append(char)
        return [result[i] for i in result]

    def primeprod(self, char):
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41,
                  43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        prod = 1
        for c in char:
            prod *= ord(c) * primes[ord(c)-ord('a')]
        return prod

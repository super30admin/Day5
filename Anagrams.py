 #TC: O(nlogk) 
 #SC:O(n)
 #Ran on Leetcode: Yes
 def primeProduct(self, str):
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 67, 71, 73, 79, 83, 89, 97, 101, 103]
        res = 1
        for i in range(len(str)):
            res *= primes[ord(str[i])-ord('a')]
        return res

    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        subRes = dict()

        for s in strs:
            primeP = self.primeProduct(s)
            if primeP not in subRes:
                subRes[primeP] = []
            subRes[primeP].append(s)
        return list(subRes.values())

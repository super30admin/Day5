#time = O(nk)
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map = {}
        for astr in strs:
            primeproduct = self.primeProduct(astr)
            if primeproduct not in map:
                map[primeproduct] = []
            map[primeproduct].append(astr)
        return list(map.values())
    def primeProduct(self , s:str) -> int:
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101]
        result = 1
        for i in range(len(s)):
            c=s[i]
            result = result * primes[ord(c) - ord('a')]
        return result


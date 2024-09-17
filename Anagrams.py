#time complexity:o(nk) 
#space complexity: o(1) 
#passed all cases on LeetCode: yes
class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        if not strs or len(strs) == 0: return []
        mapAna = {}
        for i in range(len(strs)):
            primeProduct = self.primeproduct(strs[i])
            if primeProduct not in mapAna:
                mapAna[primeProduct] = []
            mapAna.get(primeProduct).append(strs[i])
        return mapAna.values()
            
        
    def primeproduct(self,strs1):
        primes = [2, 3, 5, 7, 11 ,13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 107]
        result = 1
        for i in range(len(strs1)):
            strs1Char = strs1[i]
            result = result*primes[ord(strs1Char) - ord('a')]
        return result

            
            
            
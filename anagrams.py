from collections import defaultdict

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashmap = defaultdict(list)
        for s in strs:
            prime = self.primeProd(s)
            hashmap[prime].append(s)
        return hashmap.values()
        
            
            
    def primeProd(self,s):
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        prod=1
        for i in s:
            prod *= primes[ord(i)-ord('a')]
        return prod
            
            
#TC: O(nm) where n -> number od strings and m is length of every string
#SC: O(n) we use a hashmap to store all the strings
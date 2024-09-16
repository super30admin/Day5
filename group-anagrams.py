# Time Complexity: O(n*k)
# Space Complexity: O(n)
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anag=dict()
        for s in strs:
            st=self.primeProduct(s)
            if st not in anag:
                anag[st]=list()
            anag[st].append(s)
        return anag.values()
    def primeProduct(self,s:str)-> int:
        primes=[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103]
        res=1
        for c in s:
            res=res*primes[ord(c)-ord('a')]
        return res
# Time complexity -> O(nk)
# Space complexity -> O(n)
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashMap = {}
        
        for i in strs:
            primeProduct = self.getPrimeProduct(i)
            
            if primeProduct not in hashMap:
                hashMap[primeProduct] = [i]
            else:
                hashMap[primeProduct] += [i]
        
        return hashMap.values()
        
        
    def getPrimeProduct(self,word):
        alphabets = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        res = 1 
        
        for i in word:
            res *= alphabets[ord(i)-ord('a')]
            
        return res
        
        


        
        
        
        
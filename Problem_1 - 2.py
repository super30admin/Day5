"""

Time Complexity : O(n)
Space Complexity : O(n * k)
    
"""

class Solution:
    def prime_prod(self, string):
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        result = 1
        
        factor = ord("a")
        
        for i in string:
            result *= primes[ord(i) - factor]
            
        return result 
        
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if not strs or len(strs) == 0:
            return []
        hash_ = {}
        
        for i in strs:
            p = self.prime_prod(i)
            
            if not hash_.get(p):
                hash_[p] = [i]
                continue
            
            hash_[p].append(i)
        
        return [x for x in hash_.values()]
    
            
    
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        
        def get_prime(string):
            ans = 1
            for s in string:
                ans*= primes[ord(s)-ord('a')]
            return ans
        
        hash_map = {}
        
        for string in strs:
            prime_val = get_prime(string)
            
            if prime_val not in hash_map:
                hash_map[prime_val] = [string]
            else:
                hash_map[prime_val].append(string)
                
        return hash_map.values()
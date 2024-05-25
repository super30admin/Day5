# Time Complexity O(n)
# Space Complexity O(1)

from collections import defaultdict 
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if not strs:
            return []
        hash_map = defaultdict(list)

        def prime_product(char):
            primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
            num = 1
            for c in char:
                index = ord(c)
                num *= primes[index - ord('a')]
            return num
        for char in strs:
            sort_char = prime_product(char)
            hash_map[sort_char].append(char)
        return list(hash_map.values())

        
        
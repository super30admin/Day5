from typing import List

class Solution:
    # Time Complexity = O(n * l (log(l))) where l is length of characters in a string
    # Space Complexity = O(n) where n is the number of elements in list
    # def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
    #     if strs == None or len(strs) == 0:
    #         return {}
    #     map = {}
    #     for str in strs:
    #         sortedString = ''.join(sorted(str))
    #         if sortedString not in map.keys():
    #             map[sortedString] = []
    #         map[sortedString].append(str)
    #     return list(map.values())



    # Time Complexity = O(n * l) where l is length of characters in a string
    # Space Complexity = O(n) where n is the number of elements in list
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if strs == None or len(strs) == 0:
            return {}
        map = {}
        for str in strs:
            primeProductVal = self.primeProduct(str)
            if primeProductVal not in map.keys():
                map[primeProductVal] = []
            map[primeProductVal].append(str)
        return list(map.values())
    
    def primeProduct(self, s: str) -> int:
        result = 1
        primes = [2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103]
        for char in s :
            result *= primes[ord(char) - ord('a')]
        return result
        
obj = Solution()
print(obj.groupAnagrams(["eat","tea","tan","ate","nat","bat"]))
print(obj.groupAnagrams([""]))
print(obj.groupAnagrams(["a"]))
                
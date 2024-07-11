
#Using sorting and hashmap
# sorting 1 string takes O(k log k), so for n strings TC is O(nk log k)


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if strs == None or len(strs) == 0:
            return []
        map = {}
        for astr in strs:
            sortedString = tuple(sorted(astr)) #list are not allowed as keys so we convert this to tuple
            if sortedString not in map:
                map[sortedString] = []
            map[sortedString].append(astr)
        return map.values()



#if you multiply 2 prime numbers their product will be unique compared to other prime numbers product
#assign prime numbers to all chars a - z eg. a = 2, b=3, c=5 and so on
#TC is O(nk)

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if strs == None or len(strs) == 0:
            return []
        map = {}
        for astr in strs:
            primeProduct = self.getPrimeProduct(astr)
            if primeProduct not in map:
                map[primeProduct] = []
            map[primeProduct].append(astr)
        return map.values()

    def getPrimeProduct(self, s: str) -> int:
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103]
        result = 1
        for i in range(len(s)):
            c = s[i]
            result = result * primes[ord(c) - ord('a')] #ord function gives ascii value
        return result











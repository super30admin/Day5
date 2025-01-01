class Solution:

#TC: O(nk)
# SC: O(n)

    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
    
        def primeproduct(s):
            primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
            res = 1
            for i in range(len(s)):
                temp = ord(s[i])-ord('a')
                res *= primes[temp]
            return res

        if strs is None or len(strs) == 0:
            return []        
        hmap = {}
        for s in strs:
            temp = primeproduct(s)
            if temp not in hmap.keys():
                hmap[temp] = [s]
            else:
                hmap[temp].append(s)
        return list(hmap.values())

        
        
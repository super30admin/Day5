#Time complexity: O(n)
#Space complexity: O(n)

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        
        h = {}
        
        for i in strs:
            n = 1
            for j in i:
                n *= primes[ord(j) - ord('a')]
            if n not in h:
                h[n] = []
            h[n].append(i)
            
        return(h.values())

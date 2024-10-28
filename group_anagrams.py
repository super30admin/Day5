from collections import defaultdict
"""
Time complexity: O(m*n) where n is number of characters in string and m is number of strings
Space complexity: O(m*n), to store lists of strs
"""
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        def is_prime(num):
            if num < 2:
                return False
            for i in range(2, int(num**0.5) + 1):
                if num % i == 0:
                    return False
            return True
        def getHash(s):
            prod = 1
            for c in s:
                prod*=(prime[ord(c)-ord('a')])
            return prod
                
        count = 0
        prime = []
        num = 2
        while count<26:
            if is_prime(num):
                prime.append(num)
                count+=1
            num+=1

        hmap = defaultdict(list)
        
        for s in strs:
            hmap[getHash(s)].append(s)
        return list(hmap.values())
        
'''
Time Complexity: O(nk)
Space Complexity: O(nk)
Did this code successfully run on Leetcode : Yes (#49)
Any problem you faced while coding this : No.
Approach:
iterate through the list of strings and for each string calculate the hash key.
Each character in the string is assigned a prime number and the hash key is calculated by multiplying the prime numbers of each character.
'''

from collections import defaultdict
from typing import List

class Solution:
    def __init__(self):
        self.prime = self.computePrime(26)

    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        s = defaultdict(list)

        for i in strs:
            s[self.hashKey(i)].append(i)
        return list(s.values())
    

    def hashKey(self, s:str) -> str:
        result = 1
        for i in s:
            result *= self.prime[ord(i) - ord('a')]
        return result
    
    def computePrime(self,n) -> int:
        prime = [2]
        i = 3
        while len(prime) < n:
            for j in prime:
                if i % j == 0:
                    break
            else:
                prime.append(i)
            i += 2
        return prime
    


#driver code
s = Solution()
print(s.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"])) #Output: [["eat","tea","ate"],["tan","nat"],["bat"]]
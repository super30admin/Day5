# Time Complexity: O(nk), where n - length of strs, k - average length of a string in strs
# Space Complexity: O(nk)
# Did this code successfully run on Leetcode: Yes

# Solution:

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if not strs or len(strs) == 0:
            return []

        smap = {}

        for s in strs:
            # Compute hash for the str
            prime = self.compute_prime(s)

            # Append the str to the corresponding hash value in smap
            if prime not in smap:
                smap[prime] = []
            smap[prime].append(s)

        return list(smap.values())


    def compute_prime(self, s: str) -> int:
        """
        Computes hash for the given string
        """
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,
                  103]
        result = 1
        for ch in s:
            result *= primes[ord(ch) - ord('a')]

        return result






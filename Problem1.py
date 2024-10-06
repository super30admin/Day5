# Time Complexity = O(kn) Space Complexity = O(n) | n -> number os strings, k -> avg len of each str

class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        hash_map = {}
        for s in strs:  # n
            hash_val = self.get_hash(s)  # k
            if hash_val not in hash_map:
                hash_map[hash_val] = []

            hash_map[hash_val].append(s)

        return list(hash_map.values())

    def get_hash(self, s):
        hash_val = 1
        prime = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43,
                 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]

        for char in s:
            hash_val = hash_val * prime[ord(char) - ord('a')]

        return hash_val

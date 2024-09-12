# Time Complexity: O(nk) where n is the number of string in array and k is the number of alphabets
# Space Complexity: O(nk) where n is the number of string in array and k is the number of alphabets
# Ran on Leetcode: Yes

class Solution:
    def create_key(self, elem):
        val = [0] * 26
        for letter in elem:
            val[ord(letter) - 97] += val[ord(letter) - 97] + 1
        return str(val)
        
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashmap = {}
        for elem in strs:
            key = self.create_key(elem)
            if not hashmap.get(key):
                hashmap[key] = [elem]
            else:
                hashmap[key].append(elem)
        return hashmap.values()
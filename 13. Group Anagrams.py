# Time Complexity: O(nk)
# Space Complexity: O(nk)
# where n is number of words in given array and k is number of letters in a word

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        hash_map = {}
        prime = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103]
     
        for s in strs:
            result = 1
            for i in s:
                result = result * prime[ord(i) - ord('a')]
            if result not in hash_map:
                hash_map[result] = [s]
            else: hash_map[result].append(s)
                
        return hash_map.values()
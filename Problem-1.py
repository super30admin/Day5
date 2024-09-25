#Approach
#Compute the hashCode for each string we take first 26 prime numbers for unique representation of alphabets
# Iterate over the all given strings calculate the hashcode and add the same hash strings in the list
# iterate over the hashmap items and add the anagrams to list.

#Complexities
#Time Complexity: O(n)
# Space Complexity: O(n)

from typing import List


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        ana_dict = dict()
        result = []
        for string in strs:
            hash_value = self.gethashCode(string)
            if hash_value in ana_dict:
                ana_dict[hash_value].append(string)
            else:
                ana_dict[hash_value] = [string]
        for key in ana_dict:
            result.append(ana_dict[key])
        return result



    def gethashCode(self,str):
        prime_number = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]

        hash_value = 1
        for i in str:
            hash_value *=prime_number[ord(i)-ord('a')]
        return hash_value


s = Solution()
print(s.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))
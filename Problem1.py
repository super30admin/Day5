#Time Complexity = O(N)
# Explanation:
# 1. Use prime product hashing to get the hash value of the string.
# 2. Add all the values corresponding to that key.

#Code
class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        #using prime product

        hash_table = {}

        for i in range(len(strs)):
            hash_value = self.getHashVal(strs[i])

            if hash_value in hash_table:
                hash_table[hash_value].append(strs[i])
            else:
                hash_table[hash_value] = [strs[i]]
        return hash_table.values()


    def getHashVal(self,str):

        prime_numbers = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        hash_val =  1

        for s in str:
            hash_val = hash_val * prime_numbers[ord(s) - ord('a')]
        return hash_val

        
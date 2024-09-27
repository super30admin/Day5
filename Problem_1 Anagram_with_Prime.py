# // Time Complexity : O(nl) Where l is the length of the string
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :
#
#
# // Your code here along with comments explaining your approach

# Using Prime Product Technique

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if strs == None or len(strs) == 0:
            return []
        hashmap = {}
        prime_prod = 1
        for word in strs:
            prime_prod = self.prime_product(word)
            if prime_prod not in hashmap.keys():
                hashmap[prime_prod] = []
            hashmap[prime_prod].append(word)

        return hashmap.values()

    def prime_product(self, word):
        prime_lst = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
                     101, 103]
        prime_prod = 1
        for i in range(len(word)):
            prime_prod *= prime_lst[ord(word[i]) - ord('a')]

        return prime_prod

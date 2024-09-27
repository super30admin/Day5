# Leetcode problem link : https://leetcode.com/problems/group-anagrams/
# Time Complexity : O(n * k) where n is the number of string in array and k is the max length of each string
#  Space Complexity : O(n)
#  Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
        # Basic approach : Sort all the strings and add the anagrams for sorted values in a dictionary [O(n*k log k)]

        # Optimized approach: The main idea of this problem is to have unique hash values for each string which can be calculated by taking a product of prime numbers assigned to each character in a dictionary
            # 1. Create a dictionary for all unique hash values as keys and corresponding strings as values
            # 2. Traverse through each string in the list
            # 3. Get unique hash value by calling a function
            # 4. Create a dictionary with prime number assigned to each character
            # 5. Get the product of all the character's prime value to get unique hash
            # 6. Add each string to its prime hash key.
            # 7. Return all the values from the dictionary

class Solution:
    
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # 1
        anagram_dict = {}
        # 2
        for string in strs:
            # 3
            hash_val = self.getUniqueHash(string)
            if hash_val not in anagram_dict:
                anagram_dict[hash_val] = []
            # 6
            anagram_dict[hash_val].append(string)
        # 7
        return list(anagram_dict.values())
    
    def getUniqueHash(self,s):
        # 4
        
        char_dict = {'a': 2, 'b': 3, 'c':5, 'd':7, 'e':11, 'f':13, 'g':17,
                    'h':19, 'i':23, 'j':29, 'k':31, 'l':37, 'm':41, 'n':43,
                    'o':47, 'p':53, 'q':59, 'r':61, 's':67, 't':71, 'u':73,
                    'v':79, 'w':83, 'x':89, 'y':97, 'z':101}
        
        total = 1
        # 5
        for c in s:
            total = total * char_dict[c]
        
        return total

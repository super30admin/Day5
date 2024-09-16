class Solution:
    def groupAnagrams(self, strs):
        primes = {'a': 2,
                  'b': 3,
                  'c': 5,
                  'd': 7,
                  'e': 11,
                  'f': 13,
                  'g': 17,
                  'h': 19,
                  'i': 23,
                  'j': 29,
                  'k': 31,
                  'l': 37,
                  'm': 41,
                  'n': 43,
                  'o': 47,
                  'p': 53,
                  'q': 59,
                  'r': 61,
                  's': 67,
                  't': 71,
                  'u': 73,
                  'v': 79,
                  'w': 83,
                  'x': 89,
                  'y': 97,
                  'z': 101
                  }

        subLists = {}

        '''
        Create a map of characters assigned to unique prime numbers
        for every string calculate the product of characters*products (of each character) and use a dictionary to push the product value.
        Any time weencounter this product again, append this string to the list of values against these products in subLists.
        
        Return all values in hashmap 
        '''
        for string in strs:
            product = 1

            for character in string:
                product = primes[character] * product

            if product in subLists.keys():
                subLists[product].append(string)
            else:
                subLists[product] = [string]

        return subLists.values()

anagrams = Solution()
print(anagrams.groupAnagrams(["eat","tea","tan","ate","nat","bat"]))

'''
Time complexity - O(M*N) - M - number of elements in array, N  - average length of strings
Space Complexity - O(M) M - length of array
'''
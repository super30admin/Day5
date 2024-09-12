#Time Complexity: O(nk) here n is the length of strs(array) and k is the maximum length of a string in strs
#Space Complexity: O(nk)
#did your code exceute on leetcode - yes
#purpose - to reduce the time complexity required for sorting of the key

from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram = defaultdict(list)
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
        
        
        
        for s in strs:
            product = 1
            for x in s:
                product *= primes[x]
            if product not in anagram.keys():
                anagram[product] = [s]
            else:
                anagram[product] += [s]
        
        
        return anagram.values()
                

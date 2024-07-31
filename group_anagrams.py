# Time complexity = O(nklogk) n is no of strings in the list and k is avg length of each string
# space complexity - O(nk)
# Executed on leetcode
# sorting each string and grouping using hashmap

from collections import defaultdict
class Solution:
    # Time complexity = O(nk) n is no of strings in the list and k is avg length of each string
    # space complexity - O(nk)
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hmap = defaultdict(list)
        for each in strs:
            s_each = sorted(each)
            hmap[''.join(s_each)].append(each)
        return hmap.values()
    
# Time complexity - O(nk)
# space complexity - O(nk)
from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        prime_mapping = {
        'A': 2,
        'B': 3,
        'C': 5,
        'D': 7,
        'E': 11,
        'F': 13,
        'G': 17,
        'H': 19,
        'I': 23,
        'J': 29,
        'K': 31,
        'L': 37,
        'M': 41,
        'N': 43,
        'O': 47,
        'P': 53,
        'Q': 59,
        'R': 61,
        'S': 67,
        'T': 71,
        'U': 73,
        'V': 79,
        'W': 83,
        'X': 89,
        'Y': 97,
        'Z': 101
    }
        def prime_product(s):
            prod = 1
            for ch in s:
                prod *= prime_mapping.get(ch.upper())
            return prod
        
        hmap = defaultdict(list)
        for each in strs:
            hmap[prime_product(each)].append(each)
        return hmap.values()
    
# Time complexity - O(nk)
# space complexity - O(nk)
# using char array as hash key
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hmap = defaultdict(list)
        for each in strs:
            arr = [0] * 27
            for ch in each:
                arr[ord(ch)-ord('a')] += 1
            hmap[tuple(arr)].append(each)
        return hmap.values()
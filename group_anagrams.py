# Time Complexity : O(n*k) n = number of elements in strs array and k is largest size a word in strs
# Space Complexity: O(n*k) n = number of elements in strs array and k is largest size a word in strs
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution:
    def __init__(self):
        self._primes = {'a': 2, 
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
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        sublist = defaultdict(list)
        for string in strs:
            product=1 
            for character in string:
                product *= self._primes[character]
            sublist[product].append(string)
        return sublist.values()
        
        
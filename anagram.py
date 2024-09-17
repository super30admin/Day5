# Time complexity: O(n*k), where n: number of strings, k: length of string
# Space complexity: O(n)
# Worked on leetcode
# The algorithm associate each prime number for each character, and groups the strings whose multiplication of prime numbers is same. The multiplication
# number is stored as the key, and the strings corresponding to that mulplication number is stored as the list.


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        prime_numbers = {'a': 2,
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
                         'z': 101}

        Hashmap = {}

        for s in strs:
            mult = 1

            for char in s:
                mult = mult * prime_numbers[char]

            if mult in Hashmap.keys():
                Hashmap[mult].append(s)
            else:
                Hashmap[mult] = [s]

        output = []
        for key in Hashmap.keys():
            output.append(Hashmap[key])

        return output


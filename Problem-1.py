"""
Approach:
The idea is to use a hash map and group the strings with same chars. We can use different
approaches to hash strings.

1) we can use a counter array with 26 chars, each index corresponding to a letter from a - z
    a) this would have a constant length of keys through out the hash map
2) we could do slightly better using form factors. We can map each letter with 26 prime numbers
    and our hash function would just be the product of the primes corresponding to those
    letters
    b) this would be slightly better than the storage on approach but would still be O(n)

"""

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # method-1: using a counter key
        # mydict = defaultdict(list)
        # for s in strs:
        #     count = [0]*26
        #     for char in s:
        #         count[ord(char)-ord('a')] += 1
        #     mydict[tuple(count)].append(s)
        # return mydict.values()

        # method-2: use form factor

        groups = {}
        for word in strs:
            key = self.form_factor(word)
            if key not in groups:
                groups[key] = [word]
            else:
                groups[key].append(word)
        return groups.values()

    def form_factor(self, word):
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        out = 1
        for char in word:
            out = out * (primes[(ord(char) - ord('a'))])
        return out

"""
Time Complexity:O(n) where n is the number of chars in given list of strings
Space Complexity: O(n)
"""
"""
Brute force solution: pattern and string follow the same pattern when each letter in pattern maps to exactly one unique
word in string. Each unique word in string maps to exactly one letter in pattern.

So, traverse the string and for each character keep track of corresponding mapping in pattern and search if the character
is repeated in the string then the mapping is same. Repeat it for all characters in string. And do the same for pattern.
Time complexity: O(n*m)

Optimal Solution: Use 2 hash maps to make the search of mapping from pattern to string or string to pattern O(1).
Takes O(n) time and O(1) space complexity. Since the max mapping is fixed that is 26.

Note: It can not be done with one hash map. Fails for the case: string = "ab"  and pattern = "tat a"

Optimal solution: Use one hash map and one set. Hash map to store the mapping of one string to another and set to store
 the values of hash map that helps check the reverse mapping.
keys. Before storing the mapping, check if the value is present in the set or not.

Edge case: what if the length of strings are not equal.
"""
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:

        hmap1 = {}
        hmap2 = {}

        lst = s.split(" ")
        if len(lst) != len(pattern):
            return False

        for p, ch in zip(pattern, lst):
            if p not in hmap1:
                hmap1[p] = ch
            else:
                if hmap1[p] != ch:
                    return False

            if ch not in hmap2:
                hmap2[ch] = p
            else:
                if hmap2[ch] != p:
                    return False

        return True
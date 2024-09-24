"""
Brute force solution: Two strings s,t are Isomorphic when the all the occurrences of a character in s can be replaced
by a character in t, while maintaining the order.
So, traverse the s string and for each character keep track of corresponding mapping in t and search if the character is
repeated in the string then the mapping is same. Repeat it for all characters in s. And do the same for t.
Time complexity: O(n*m)

Optimal Solution: Use 2 hash maps to make the search of mapping from s to t or t to s O(1).
Takes O(n) time and O(1) space complexity. Since the max mapping is fixed that is 26.

Note: It can not be done with one hash map. Fails for the case: s = "ab"  and t = "ta"

Optimal solution: Use one hash map and one set. Hash map to store the mapping of one string to another and set to store
 the values of hash map that helps check the reverse mapping.
keys. Before storing the mapping, check if the value is present in the set or not.

Edge case: what if the length of strings are not equal.
"""
class Solution:

    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        if len(s) == 0 or len(t) == 0:
            return False

        hmap1 = {}
        hmap2 = {}

        for chs, cht in zip(s, t):
            # s to t
            if chs not in hmap1:
                hmap1[chs] = cht
            else:
                if hmap1[chs] != cht:
                    return False

            if cht not in hmap2:
                # t to s
                hmap2[cht] = chs
            else:
                if hmap2[cht] != chs:
                    return False

        return True
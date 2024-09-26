# Example 1: Input: s = "egg", t = "add" Output: true
# Example 2: Input: s = "foo", t = "bar" Output: false
"""We use two hashmaps to store the mappings. First hashmap is from s to t and the second hashmap is for t to s."""

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:

        # Time Complexity = O(n)
        # Space Complexity = O(n) if using two hashmaps - O(1) if we use character array

        # If the length of the strings is different, they can't be isomorphic
        if len(s) != len(t):
            return False

        # Two hashmaps to store the mappings
        mapST, mapTS = {}, {}

        # Traversing through the strings
        for i in range(len(s)):
            c1, c2 = s[i], t[i]

            # If the value is present but the mapping is wrong
            if ((c1 in mapST and mapST[c1] != c2) or
                    (c2 in mapTS and mapTS[c2] != c1)):
                return False

            # Else, create the mapping in both the hashmaps
            mapST[c1] = c2
            mapTS[c2] = c1

        return True
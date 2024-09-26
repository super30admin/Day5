class Solution(object):
    # Approach:
    # - Use two hash maps to track character mappings between 's' and 't'.
    # - For each character pair (c1, c2) in 's' and 't':
    #   1. If c1 is already mapped to a different character than c2, or if c2 is mapped to a different c1, return False.
    #   2. Otherwise, update the mappings and continue.
    # - If all mappings are consistent, return True.

    # Time complexity: O(n), where n is the length of the strings.
    # Space complexity: O(n), for storing the mappings.

    def isIsomorphic(self, s, t):
        mapST, mapTS = {}, {}

        for i in range(len(s)):
            c1, c2 = s[i], t[i]

            if((c1 in mapST and mapST[c1] != c2) or (c2 in mapTS and mapTS[c2] != c1)):
                return False

            mapST[c1] = c2
            mapTS[c2] = c1
        
        return True

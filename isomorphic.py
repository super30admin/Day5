"""
Time Compleity: O(n)
Space Complexity: O(2n)
"""


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sTot = {}
        tTos = {}

        if len(s) != len(t):
            return False
        for c1, c2 in zip(s, t):
            if (c1 not in sTot) and (c2 not in tTos):
                sTot[c1] = c2
                tTos[c2] = c1
            elif sTot.get(c1) != c2 or tTos.get(c2) != c1:
                return False
        return True

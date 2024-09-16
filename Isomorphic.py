# TC: O(n), 
# SC: O(1); 
# Ran on Leetcode: yes
 


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        mapST = dict()
        mapTS = dict()

        for c1, c2 in zip(s,t):

            if (c1 not in mapST) and (c2 not in mapTS):
                mapST[c1] = c2
                mapTS[c2] = c1
            elif mapST.get(c1) != c2 or mapTS.get(c2) != c1:
                return False
        return True
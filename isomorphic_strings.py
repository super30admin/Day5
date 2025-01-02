# Time Complexity = O(n)
# Space Complexity = O(1)
# Leetcode = yes
# Approach =  use two hash maps to track character mappings between the strings. Iterate through the characters, ensuring each maps consistently. Return False if inconsistencies are found; otherwise, return True.

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        countSt = {}
        countTs = {}
        for i in range(len(s)):
            c1,c2 = s[i],t[i]
            if ((c1 in countSt and countSt[c1] != c2) or (c2 in countTs and countTs[c2] != c1)):
                return False
            countSt[c1] = c2
            countTs[c2] = c1
        return True
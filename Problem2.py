# Problem 2: Isomorphic Strings

# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No

# Approach:
# To determine if two strings s and t are isomorphic, first check if their lengths are equal. 
# Use a mapping (sMap) to track character correspondences and a set (tSet) to ensure no two characters in s map to the same character in t. 
# If any mapping conflicts arise during iteration, return False; otherwise, return True after checking all characters.

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        sMap = {}
        tSet = set()

        for sc, tc in zip(s, t):
            if sc not in sMap:
                if tc in tSet:
                    return False
                sMap[sc] = tc
                tSet.add(tc)
            else:
                if sMap[sc] != tc:
                    return False

        return True
        
#205. Isomorphic Strings
"""
Time Complexity : O(n)
Space Complexity : O(1)
Success in Leetcode? : YES
Any problem faced? : NO

Strings are Isomorphic only if s is isomorphic with t and vice-versa.
To check s is isomorphic with t, we use hashmap. key = char from s and value = char from t at same index
as that of s. If there is a conflict, then return false.
Using property of hashmap that keys are unique and search is done in O(1)
"""

class Solution:
    def helper(self, x, y, l) -> bool:
        d = dict()
        for i in range(0, l):
            #if i is presetnt in dict, then check its associated value with 2nd string char.
            if x[i] in d:
                #if respective value is same, then there is conflict, return False from here.
                if d.get(x[i]) != y[i]:
                    return False
            #if not present, add it to dict with its associated value with 2nd string char.
            else:
                d.update({x[i]: y[i]})

        return True

    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        if self.helper(s, t, len(s)):
            if self.helper(t, s, len(s)):
                return True
            else:
                return False

        else:
            return False

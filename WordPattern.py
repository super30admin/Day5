#290. Word Pattern
"""
Time Complexity : O(n)
Space Complexity : O(1)
Success in Leetcode? : YES
Any problem faced? : NO

Strings are Isomorphic only if s is isomorphic with t and vice-versa.
To check s is isomorphic with t, we use hashmap. key = char from s and value = char from t at same index
as that of s. If there is a conflict, then return false.
Using property of hashmap that keys are unique and search is done in O(1)
Same as isomorphic strings but here we are making key value of pairs of char : string and string:char
instead og char: char
"""

class Solution:

    def helper(self, x, y, l):
        d = dict()
        for i in range(0, l):
            if x[i] in d:
                if d.get(x[i]) != y[i]:
                    return False
            else:
                d.update({x[i]: y[i]})

        return True

    def wordPattern(self, pattern: str, s: str) -> bool:
        li = s.split(" ")
        print(li)

        if len(li) != len(pattern):
            return False

        if self.helper(pattern, li, len(li)):
            if self.helper(li, pattern, len(li)):
                return True
            else:
                return False

        else:
            return False

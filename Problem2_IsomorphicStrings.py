# Time Complexity: O(n), where n - number of chars in either of the string
# Space Complexity: O(1), since size of ASCII char set is fixed
# Did this code successfully run on Leetcode: Yes

# Solution:

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:

        # If strings are not of same length, they cannot be isomorphic
        if len(s) != len(t):
            return False

        # Two dictionaries to store the mappings of chars from s to t and t to s
        smap = {}
        tmap = {}

        for i in range(len(s)):
            schar = s[i]
            tchar = t[i]

            # Check s to t mapping
            if schar in smap:
                if smap[schar] != tchar:
                    return False
            else:
                smap[schar] = tchar

            # Check t to s mapping
            if tchar in tmap:
                if tmap[tchar] != schar:
                    return False
            else:
                tmap[tchar] = schar

        return True

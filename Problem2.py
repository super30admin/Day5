"""
Leetcode #205  https://leetcode.com/problems/isomorphic-strings/description/
Isomorphic Strings
"""


class Solution:
    """
    Brute Force Approach:
    In this approach, we determine if two strings `s` and `t` are isomorphic by directly comparing their patterns. 
    We identify if the characters in one string consistently map to the corresponding characters in the other string.

    For example:
    - In the strings "foo" and "too":
      - Both have the same pattern: one unique letter followed by two repeated letters.
      - This means the strings are isomorphic.

    Algorithm:
    1. Use two nested loops to iterate through every pair of characters in the strings `s` and `t`.
    2. For each pair of indices `i` and `j`:
       - Check if the pattern between characters in `s` matches the pattern between characters in `t`.
       - Specifically:
         - If `s[i] == s[j]`, then `t[i]` must equal `t[j]`.
         - If `s[i] != s[j]`, then `t[i]` must not equal `t[j]`.
    3. If any discrepancy is found, the strings are not isomorphic, and we return `False`.
    4. If no discrepancies are found after all iterations, return `True`.

    Time Complexity:
    - O(N²), where N is the length of the strings. 
      This is due to the nested loops that compare all pairs of indices.

    Space Complexity:
    - O(1), as no additional data structures are used.
    """

    def isIsomorphicBruteForce(self, s: str, t: str) -> bool:

        # Edge case: If either string is empty, return False
        if not s or not t:
            return False

        # Iterate through all pairs of indices in the strings
        for i in range(len(s)):
            for j in range(len(s)):
                # Relationship between s[i] and s[j] must match relationship between t[i] and t[j]
                if (s[i] == s[j] and t[i] != t[j]) or (s[i] != s[j] and t[i] == t[j]):
                    return False

        # If we traverse the entire strings without inconsistencies, return True
        return True

    """
    Optimized Approach:
    To determine if two strings `s` and `t` are isomorphic, we map each character from `s` to `t` and vice versa.
    If at any point the mapping is inconsistent, the strings are not isomorphic.

    Steps:
    1. Use two dictionaries (`smap` and `tmap`) to store the mappings:
       - `smap`: Maps characters from `s` to corresponding characters in `t`.
       - `tmap`: Maps characters from `t` to corresponding characters in `s`.
    2. Traverse both strings simultaneously.
    3. For each character in the strings:
       - Check if the character in `s` has been mapped to a different character in `t`.
       - Check if the character in `t` has been mapped to a different character in `s`.
    4. If any inconsistency is found, return `False`.
    5. If the traversal completes without inconsistencies, return `True`.

    Time Complexity:
    - O(N), where N is the length of the strings `s` and `t`. We traverse both strings once.

    Space Complexity:
    - O(1), as the size of the character set (e.g., ASCII or Unicode) is constant.
    """

    def isIsomorphic(self, s: str, t: str) -> bool:
        # Dictionary to map characters from 's' to 't'
        smap = {}
        # Dictionary to map characters from 't' to 's'
        tmap = {}

        # Traverse both strings character by character
        for i in range(len(s)):
            schar = s[i]  # Current character in 's'
            tchar = t[i]  # Current character in 't'

            # Check if schar is already mapped to a different tchar
            if schar in smap:
                if smap[schar] != tchar:
                    return False
            else:
                # Add the mapping schar -> tchar
                smap[schar] = tchar

            # Check if tchar is already mapped to a different schar
            if tchar in tmap:
                if tmap[tchar] != schar:
                    return False
            else:
                # Add the mapping tchar -> schar
                tmap[tchar] = schar

        # If we traverse the entire strings without inconsistencies, return True
        return True

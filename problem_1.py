"""
Problem 1: Isomorphic Strings
"""

# Two hashmaps approach
# Time Complexity: O(n)
# Space Complexity: O(1)


def isIsomorphic(s: str, t: str) -> bool:
    if len(s) != len(t) or not s or len(s) == 0:
        return False

    s_map = {}
    t_map = {}

    for i in range(len(s)):
        s_char = s[i]
        t_char = t[i]

        if s_char in s_map and s_map[s_char] != t_char:
            return False
        else:
            s_map[s_char] = t_char

        if t_char in t_map and t_map[t_char] != s_char:
            return False
        else:
            t_map[t_char] = s_char

    return True

isIsomorphic("egg", "add")  # True
isIsomorphic("foo", "bar")  # False
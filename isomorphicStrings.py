"""
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving
the order of characters. No two characters may map to the same character, but a character may map to itself.

Different approaches - 2 hashmaps. 1 hashmap+ 1 hashset. 2 arrays.

Approach used - 1 hashmap, 1 hashset --
TC - O(n)
SC - O(1) ==> since specific number of characters
"""

# s1 = "egdp"
# t1 = "adda"

s1 = "egGp"
t1 = "addn"


def isIsomorphic(s, t):
    # base case
    if s is None or t is None: return False
    if s is None and t is None: return True

    if len(s) != len(t): return False

    # set DS
    sMap = {}
    tSet = set()

    for i in range(len(s)):
        if s[i] not in sMap:
            sMap[s[i]] = t[i]
        if s[i] in sMap and sMap[s[i]] != t[i]: return False

    for i in range(len(t)):
        tSet.add(t[i])

    if len(sMap) != len(tSet): return False

    return True


if __name__ == '__main__':
    print(isIsomorphic(s1, t1))

# Time Complexity : O(n) - n is length of s or t
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

"""
I will maintain two dictionaries:
First one for mapping of characters in s to t
Second one for mapping of characters in t to s

And then iterate over the two strings, if any of the character is already there in the
dictionaries but the value doesn't match with the current mapping, return False
"""

def isIsomorphic(s, t):
    dict_st = {}
    dict_ts = {}

    if len(s) != len(t):
        return False

    for i in range(0, len(s)):
        if s[i] not in dict_st:
            dict_st[s[i]] = t[i]
        elif dict_st[s[i]] != t[i]:
            return False

        if t[i] not in dict_ts:
            dict_ts[t[i]] = s[i]
        elif dict_ts[t[i]] != s[i]:
            return False

    return True









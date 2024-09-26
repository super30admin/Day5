# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No

# // Your code here along with comments explaining your approach:
# Maintain 2 hashmaps to check for A->B and B->A mapping. If the mapping in both hashmaps are same, then the strings are isomorphic, else they are not.

def isIsomorphic(s, t):

    hashmap_a = {}
    hashmap_b = {}

    for i in range(len(s)):

        if s[i] not in hashmap_a:
            hashmap_a[s[i]] = t[i]

        else:  # if it is there in hashmap
            if hashmap_a[s[i]] != t[i]:
                return False

        if t[i] not in hashmap_b:
            hashmap_b[t[i]] = s[i]

        else:  # if it is there in hashmap
            if hashmap_b[t[i]] != s[i]:
                return False

    return True
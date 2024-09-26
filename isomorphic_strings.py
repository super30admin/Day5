# Time Complexity: O(N)
# Space Complexity : O (1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Yes, working around enumerate()
class Solution:

    def isIsomorphic(s, t):
        if len(s) != len(t):
            return False
        hash_map = {}  # create an empty hash map
        for i, j in enumerate(s):  # enumerate() to have a counter while looping through string s
            if j in hash_map.keys() and hash_map[j] != t[i]:
                return False
            elif j not in hash_map.keys() and t[i] in hash_map.values():
                return False
            else:
                hash_map[j] = t[i]

        return True

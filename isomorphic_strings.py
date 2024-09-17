#Time complexity: O(n)
# Space complexity: O(n)
# Worked on leetcode
# The algorithm checks if the mapping is one to one from a string s-> string t, and vice versa,
# by creating 2 hashmaps. If any of the one-on-one mapping condition is violated in either of the 2
# hashmaps, it returns False


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:

        if len(s) != len(t):
            return False

        else:
            Hashmap = {}
            for index in range(len(s)):
                if s[index] in Hashmap.keys():
                    if t[index] != Hashmap[s[index]]:
                        return False
                else:
                    Hashmap[s[index]] = t[index]

            Hashmap = {}
            for index in range(len(t)):
                if t[index] in Hashmap.keys():
                    if s[index] != Hashmap[t[index]]:
                        return False
                else:
                    Hashmap[t[index]] = s[index]

            return True







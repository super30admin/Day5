# Time Complexity : O(n), where n is the length of a string
# Space Complexity : O(1), since the number of characters is limited to 26
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        dict_s = {}
        dict_t = {}

        for char_s, char_t in zip(s, t):

            if char_s in dict_s:
                if dict_s[char_s] != char_t:
                    return False

            else:
                dict_s[char_s] = char_t

            if char_t in dict_t:
                if dict_t[char_t] != char_s:
                    return False

            else:
                dict_t[char_t] = char_s

        return True

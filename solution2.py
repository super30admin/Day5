#time: O(n)
# space: O(26) = O(1)
class Solution(object):
    def isIsomorphic(self, s, t):
        # approach: 2 strings are isomorphic iff a is iso to b and b is iso to a
        s_map, t_map = {}, {}
        for i in range(len(s)):
            s_char, t_char = s[i], t[i]
            if s_char not in s_map:
                s_map[s_char] = t_char
            elif s_map[s_char] != t_char:
                return False

            if t_char not in t_map:
                t_map[t_char] = s_char
            elif t_map[t_char] != s_char:
                return False
        return True

        
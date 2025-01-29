# We use two hash maps to maintain a one-to-one mapping between characters of s and t, ensuring that each character 
# in s maps uniquely to a character in t and vice versa.
# Time Complexity: O(N), where N is the length of s and t, as we iterate once.
# Space Complexity: O(1), since the hash maps store at most 26 characters (constant space).
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        map_s_t = {}
        map_t_s = {}
        for c1, c2 in zip(s, t):
            if(c1 not in map_s_t) and (c2 not in map_t_s):
                map_s_t[c1] = c2
                map_t_s[c2] = c1
            elif map_s_t.get(c1)!=c2 or map_t_s.get(c2) != c1:
                return False
        return True
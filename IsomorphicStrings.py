'''
    Time Complexity:
        O(n)

    Space Complexity:
        O(n)

    Did this code successfully run on LeetCode?:
        Yes

    Problems faced while coding this:
        None

    Approach:
        For each string, create a char-to-char map with another string.
        Check equality.
'''
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        return self.check_a_to_b(s, t) and self.check_a_to_b(t, s)

    def check_a_to_b(self, a, b):
        map = {}
        for idx, c in enumerate(a):
            if c in map and map[c] != b[idx]:
                return False
            map[c] = b[idx]
        return True



from collections import defaultdict


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t): return False
        s_to_t_map = defaultdict(str)
        t_to_s_map = defaultdict(str)
        for character in range(0, len(s) ):
            if s[character] not in s_to_t_map.keys():
                s_to_t_map[s[character]] = t[character]
            else:
                if s_to_t_map[s[character]] != t[character]:
                    return False

        for character in range(0, len(t) ):
            if t[character] not in t_to_s_map.keys():
                t_to_s_map[t[character]] = s[character]
            else:
                if t_to_s_map[t[character]] != s[character]:
                    return False

        return True

if __name__ == '__main__':
    print(Solution().isIsomorphic('foo','bar'))

    # Space o(constant)
    # tiem O(n)
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        char_map = {}

        for sc, tc in zip(s, t):
            if sc in char_map:
                if char_map[sc] != tc:
                    return False
            elif tc in char_map.values():
                return False

            char_map[sc] = tc

        return True
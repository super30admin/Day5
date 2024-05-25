# Time complexity O(n)
# Space Complexity O(1)
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        p_list= pattern
        s_list = s.split()
        if len(p_list) != len(s_list):
            return False
        p_map = {}
        s_map = set()
        for p_char, s_char in zip(p_list, s_list):
            if p_char in p_map:
                if p_map[p_char] != s_char:
                    return False
            else:
                p_map[p_char] = s_char
                if s_char in s_map:
                    return False
                else:
                    s_map.add(s_char)
        return True

        
# Time Complexity = O(n) Space Complexity = O(1)
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if s is None or t is None or len(s) != len(t):
            return False

        is_iso = False
        hash_map = {}
        hash_set = set()

        for i in range(0, len(s)):
            if s[i] in hash_map:
                if hash_map[s[i]] != t[i]:
                    return False
            else:
                if t[i] in hash_set: return False
                hash_set.add(t[i])
                hash_map[s[i]] = t[i]

        return True




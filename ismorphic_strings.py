# O(min(n,m)) time where n is len(s) and m is len(t)
# O(n + m) space
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        mappings_s = {}
        used_keys = {}
        for i in range(len(s)):
            if s[i] not in mappings_s:
                if t[i] in used_keys:
                    return False
                mappings_s[s[i]] = t[i]
                used_keys[t[i]] = True
            else:
                if t[i] != mappings_s[s[i]]:
                    return False
        return True

s = Solution()
print(s.isIsomorphic("aa","ab")) 
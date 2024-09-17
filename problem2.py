// Time complexity: O(n)
// Space complexity: O(1)
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        hash_s = {}
        hash_t = {}
        if len(s) == len(t):
            for i in range(len(s)):
                if s[i] in hash_s and hash_s.get(s[i]) != t[i]:
                    return False
                else:
                    hash_s[s[i]] = t[i]
                if t[i] in hash_t and hash_t.get(t[i]) != s[i]:
                    return  False
                else:
                    hash_t[t[i]] = s[i]
            return True
        else:
            return False

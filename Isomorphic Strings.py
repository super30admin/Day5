class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        dict1, dict2, size = {}, {}, len(s)
        for i in range(size):
            if s[i] not in dict1:
                dict1[s[i]] = t[i]
            elif s[i] in dict1:
                if dict1[s[i]] != t[i]: return False
            if t[i] not in dict2:
                dict2[t[i]] = s[i]
            elif t[i] in dict2:
                if dict2[t[i]] != s[i]: return False
        return True

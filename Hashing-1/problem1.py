class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        hashmap_st = {}
        hashmap_ts = {}
        for i in range(len(s)):
            if i == 0:
                hashmap_st[s[i]] = t[i]
                hashmap_ts[t[i]] = s[i]
            elif s[i] in hashmap_st:
                if hashmap_st[s[i]] != t[i]:
                    return False
            elif t[i] in hashmap_ts:
                if hashmap_ts[t[i]] != s[i]:
                    return False
            hashmap_st[s[i]] = t[i]
            hashmap_ts[t[i]] = s[i]
        return True
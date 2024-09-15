# TC : O(N)
# SC : O(L), L is the words in dict


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        hmap_s = {}
        hmap_t = {}
        for i in range(len(s)):
            if s[i] not in hmap_s and t[i] not in hmap_t:
                hmap_s[s[i]] = t[i]
                hmap_t[t[i]] = s[i]
            elif hmap_s.get(s[i]) != t[i]:
                return False
        return True  

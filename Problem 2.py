#Used 2 hashmap approach and compared if they are equal
#Time is O(n) since we parse over each alphabet
#Space is O(1) since the alphabets are limited
#Yes, this worked in leetcode


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s)!=len(t) or len(s) == 0:
            return False
        smap = {}
        tmap = {}
        for i in range(len(s)):
            if s[i] in smap:
                if smap[s[i]]!=t[i]:
                    return False
            else:
                smap[s[i]] = t[i]
            if t[i] in tmap:
                if tmap[t[i]]!=s[i]:
                    return False
            else:
                tmap[t[i]] = s[i]
        return True
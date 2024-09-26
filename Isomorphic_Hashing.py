class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:

        if not s or not t or len(s) != len(t):
            return

        smap = {}
        tmap = {}

        for i in range(len(s)):
            svalue = smap.get(s[i])
            if svalue:
                if t[i] != svalue:
                    return False
            else:
                smap[s[i]] = t[i]

            tvalue = tmap.get(t[i])
            if tvalue:
                if s[i] != tvalue:
                    return False
            else:
                tmap[t[i]] = s[i]
        return True



class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        slen = len(s)
        tlen = len(t)

        if slen != tlen:
            return True

        sMap = { }
        tMap = { }

        for i in range(slen):
            sChar = s[i]
            tChar = t[i]

            if sChar in sMap:
                if sMap.get(sChar) != tChar:
                    return False
            else:
                sMap[sChar] = tChar


            if tChar in tMap:
                if tMap.get(tChar) != sChar:
                    return False
            else:
                tMap[tChar] = sChar

        return True
        
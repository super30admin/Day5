# Time Complexity = O(n)   Space Complexity = O(n)
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        sMap = {}
        tMap = {}

        for i in range(len(s)):
            sCh = s[i]
            tCh = t[i]
            if sCh in sMap:
                if sMap[sCh] != tCh:
                    return False
            else:
                sMap[sCh] = tCh

            if tCh in tMap:
                if tMap[tCh] != sCh:
                    return False
            else:
                tMap[tCh] = sCh

        return True
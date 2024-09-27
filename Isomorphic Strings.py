# Time: O(n)
# Space: O(1)
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        StoT, TtoS = {}, {}
        for i, j in zip(s, t):
            if ((i in StoT and StoT[i] != j) or (j in TtoS and TtoS[j] != i)):
                return False
            StoT[i] = j
            TtoS[j] = i
        return True






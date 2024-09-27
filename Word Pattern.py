# Time: O(n)
# Space: O(1)
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split(" ")
        if len(pattern) != len(words):
            return False

        PtoW, WtoP = {}, {}
        for i, j in zip(pattern, words):
            if ((i in PtoW and PtoW[i] != j) or (j in WtoP and WtoP[j] != i)): 
                return False
            PtoW[i] = j
            WtoP[j] = i
        return True

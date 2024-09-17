'''
Time Complexity - O(n) as we iterate in both the strings
Space Complexity- O(1) as we use only constant space in auxillary DS
'''


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        smap = {}
        tmap = {}
        s = s.split(" ")
        if len(s) != len(pattern):
            return False
        for i, j in zip(pattern, s):
            if i in smap:
                if (smap[i] != j):
                    return False
            else:
                if j in tmap and (tmap[j] != i):
                    return False
            smap[i] = j
            tmap[j] = i
        return True

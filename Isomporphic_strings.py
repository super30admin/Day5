class Solution(object):
    def isIsomorphic(self, s, t):
        d1, d2 = dict(), dict()
        for v, w in zip(s,t):
            if (v in d1 and d1[v] != w) or (w in d2 and d2[w] != v):
                return False
            d1[v], d2[w] = w, v
        return True
    #O(N) Time Complexity
    #O(1) Space complexity
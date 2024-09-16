#TC:(n)
#SC:O(m)
#Ran on Leetcode: Yes


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        mapP = dict()
        mapS = dict()
        words = s.split(' ')

        if len(words) != len(pattern):
            return False

        for c1, c2 in zip(pattern,words):

            if (c1 not in mapP):
                if c2 in mapS:
                    return False
                else:
                    mapP[c1] = c2
                    mapS[c2] = c1
            elif mapP[c1] != c2:
                return False
        return True
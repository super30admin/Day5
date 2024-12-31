#Time complexity: O(n+m)
#Space complexity: O(u+v)
#Leetcode: Yes

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        t = s.split(" ")

        if len(pattern) != len(t):
            return False

        sd = {}
        td = {}

        for c1,c2 in zip(pattern,t):
            if (c1 in sd and sd[c1] != c2) or (c2 in td and td[c2] != c1):
                return False
            sd[c1] = c2
            td[c2] = c1
        return True
    
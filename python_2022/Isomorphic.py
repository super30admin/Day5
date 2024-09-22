#  Time Complexity : O(n)
#  Space Complexity : O(1)
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : No

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        sMap = {}
        tMap = {}
        for i in range(len(s)):
            a = s[i]
            b = t[i]

            if a in sMap and sMap[a] != b:
                return False
            if b in tMap and tMap[b] != a:
                return False

            sMap[a] = b
            tMap[b] = a

        return True

Obj=Solution()
print(Obj.isIsomorphic('add','egg'))
print(Obj.isIsomorphic('foo','bar'))
print(Obj.isIsomorphic('paper','title'))
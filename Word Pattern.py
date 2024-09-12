""""// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
"""


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s = s.split()
        pMap = {}
        sMap = {}

        if len(pattern) != len(s):
            return False

        for i in range(len(s)):
            a = pattern[i]
            b = s[i]

            if a in pMap and pMap[a] != b:
                return False
            if b in sMap and sMap[b] != a:
                return False

            pMap[a] = b
            sMap[b] = a

        return True

# class Solution:
#     def wordPattern(self, pattern: str, s: str) -> bool:
#         s=s.split()
#         d={}
#         if len(s)!=len(pattern):
#             return False
#         for i in range(len(pattern)):
#             if pattern[i] not in d and s[i] not in d.values():
#                 d[pattern[i]]= s[i]
#             elif pattern[i] not in d or d[pattern[i]]!=s[i]:
#                 return False
#         return True
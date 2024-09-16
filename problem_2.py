# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
#
#

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        dictu = {}
        dictu1 = {}
        for i in range(len(s)):
            if s[i] in dictu and dictu[s[i]] != t[i]:
                return False
            elif t[i] in dictu1 and dictu1[t[i]] != s[i]:
                return False
            dictu[s[i]] = t[i]
            dictu1[t[i]] = s[i]
        return True


check = Solution()
print(check.isIsomorphic('ab', 'ba'))


# class Solution:
#     def isIsomorphic(self, s: str, t: str) -> bool:
#         dictu = [0] * 256
#         dictu1 = [0] * 256
#         for i in range(len(s)):
#             x = ord(s[i]) - ord(' ')
#             y = ord(t[i]) - ord(' ')
#             if dictu[x] == 0 and dictu1[y] == 0:
#                 dictu[x] = t[i]
#                 dictu1[y] = s[i]
#             elif dictu[x] != t[i]:
#                 return False
#             elif dictu1[y] != s[i]:
#                 return False
#         return True
#
#
# check = Solution()
# print(check.isIsomorphic('paperl', 'lxlalp'))


# class Solution:
#     def isIsomorphic(self, s: str, t: str) -> bool:
#         dictu = {}
#         hs = set()
#         for i in range(len(s)):
#             if s[i] not in dictu and t[i] not in hs:
#                 dictu[s[i]] = t[i]
#                 hs.add(t[i])
#             elif s[i] in dictu and dictu[s[i]] != t[i]:
#                 return False
#             elif s[i] not in dictu and t[i] in hs:
#                 return False
#         return True
#
#
# check = Solution()
# print(check.isIsomorphic('paperl', 'lxlalp'))


# class Solution:
#     def isIsomorphic(self, s: str, t: str) -> bool:
#         dictu = {}
#         for i in range(len(s)):
#             if s[i] not in dictu and t[i] not in dictu.values():
#                 dictu[s[i]] = t[i]
#             elif s[i] not in dictu or dictu[s[i]] != t[i]:
#                 return False
#         return True
#
#
# check = Solution()
# print(check.isIsomorphic('paperl', 'lxlalp'))


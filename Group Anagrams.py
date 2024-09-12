""""// Time Complexity : O(nk)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
"""
class Solution:
    def groupAnagrams(self, strs):
        d = {}
        for i in strs:
            x = self.primeProduct(i)
            if x not in d:
                d[x] = []
            d[x].append(i)
        return d.values()

    def primeProduct(self, s):
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,
                  103]
        result = 1
        for i in s:
            result = result * primes[ord(i) - ord('a')]
        return result


# Time Complexity: O(nklogk)
# Space Complexity: O(1)
#
# class Solution:
#     def groupAnagrams(self, strs):
#         dic = {}
#         for i in strs:
#             if ''.join(sorted(i)) not in dic:
#                 dic[''.join(sorted(i))] = [i]
#             else:
#                 dic[''.join(sorted(i))].append(i)
#         return dic.values()
# Obj=Solution()
# print(Obj.groupAnagrams(["eat","tea","tan","ate","nat","bat"]))
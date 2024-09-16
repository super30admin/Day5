# Time Complexity : O(n*k)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
#
#

class Solution:
    def key(self, str):
        k = {'a': 2, 'b': 3, 'c': 5, 'd': 7, 'e': 11, 'f': 13, 'g': 17, 'h': 19, 'i': 23, 'j': 29, 'k': 31, 'l': 37,
             ' m': 41, 'n': 43, 'o': 47, 'p': 53, 'q': 59, 'r': 61, 's': 67, 't': 71, 'u': 73, 'v': 79, 'w': 83,
             'x': 89, 'y': 97, 'z': 101}
        key = 1
        for i in str:
            key *= k[i]
        return key

    def groupAnagrams(self, strs: list[str]):
        dictu = {}
        for i in strs:
            key = self.key(i)
            if key not in dictu:
                dictu[key] = [i]
            else:
                dictu[key].append(i)
        return dictu.values()


check = Solution()
print(check.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))


# class Solution:
#     def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
#         dictu = {}
#         for i in strs:
#             if ''.join(sorted(i)) not in dictu:
#                 dictu[''.join(sorted(i))] = [i]
#             else:
#                 dictu[''.join(sorted(i))].append(i)
#         return dictu.values()
#
#
# check = Solution()
# print(check.groupAnagrams(["eat","tea","tan","ate","nat","bat"]))

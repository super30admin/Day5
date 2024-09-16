# Time complexity : O(n* klogk) where n is the length of the input list and k is the length of the string
# Space complexity : O(n)
# Did this code run on leetcode : Yes
# Any difficulty solving this problem : No


import collections


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hmap = collections.defaultdict(list)
        for word in strs:
            # sorting the word takes klogk
            sortedWord = sorted(list(word))
            hmap[''.join(sortedWord)].append(word)

        return hmap.values()


solution = Solution()
print(solution.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))
print(solution.groupAnagrams([""]))
print(solution.groupAnagrams(["a"]))

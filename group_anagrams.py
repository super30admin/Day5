# Time Complexity : O(N * L log L) where N is number of strings and L is max length of string
# Space Complexity : O(N * L) where N is number of strings and L is max length of string
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

from collections import defaultdict
class Solution(object):
    def groupAnagrams(self, wordlist):
        hashmap = defaultdict(list)

        for word in wordlist:
            hashmap[tuple(sorted(word))].append(word)
        
        return list(hashmap.values())

solution = Solution()
print(f"OUTPUT >> {solution.groupAnagrams(['eat', 'tea', 'tan', 'ate', 'nat', 'bat'])}")
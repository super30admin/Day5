# Time Complexity : O(k * nlog(n)) where K in number of elements in the list and n in the length of the items.
# Space Complexity : O(n)  where n in the number of items in the list.
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        d = {}
        for i in strs:
            s = tuple(sorted(i))
            if s not in d:
                d[s] = [i]
            else:
                d[s].append(i)
        return d.values()

# Time Complexity : O(m+n)
# Space Complexity :O(m+n)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO


# Your code here along with comments explaining your approach in three sentences only
# similar to isomorphic strings - map letter with the word in words separately and check

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split()

        if len(words) != len(pattern):
            return False

        hm = {}
        hm1 = {}

        for i in range(len(pattern)):
            if (pattern[i] in hm and hm[pattern[i]] != words[i]) or (words[i] in hm1 and hm1[words[i]] != pattern[i]):
                return False
            hm[pattern[i]] = words[i]
            hm1[words[i]] = pattern[i]
        return True
        
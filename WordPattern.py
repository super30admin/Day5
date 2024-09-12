"""
Time Complexity : O(n) 
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
"""
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        patDict = {}
        wordDict = {}
        words = s.split(" ")
        if len(pattern) != len(words):
            return False
        else:
            for i in range(len(pattern)):
                if pattern[i] not in patDict and words[i] not in wordDict:
                    patDict[pattern[i]] = words[i]
                    wordDict[words[i]] = pattern[i]
                else:
                    if patDict.get(pattern[i]) != words[i] or wordDict.get(words[i]) != pattern[i]:
                        return False
            return True
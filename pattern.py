# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split()
        
        if len(words)!=len(pattern):
            return False
        
        w2c = {}
        c2w = {}
        
        for i in range(len(pattern)):
            if (words[i] in w2c.keys() and w2c.get(words[i])!=pattern[i] or
                pattern[i] in c2w.keys() and c2w.get(pattern[i])!=words[i]):
                return False
            else:
                w2c[words[i]] = pattern[i]
                c2w[pattern[i]] = words[i]
        return True
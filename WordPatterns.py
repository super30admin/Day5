# Time Complexity : O(N)

# Space Complexity : O(1) since only lowercase alphabets

# Did this code successfully run on Leetcode :
# Yes

# Any problem you faced while coding this :
# No

# Your code here along with comments explaining your approach
# I have maintained a two-way mapping by using two HashMaps.

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split()

        if len(pattern) != len(words):
            return False

        patternMap = {}
        sMap = {}

        for i in range(len(words)):
            if pattern[i] not in patternMap:
                patternMap[pattern[i]] = words[i]
            else:
                if patternMap[pattern[i]] != words[i]:
                    return False

            if words[i] not in sMap:
                sMap[words[i]] = pattern[i]
            else:
                if sMap[words[i]] != pattern[i]:
                    return False
        return True
# Time Complexity: O(n) where n is number of letters in pattern
# Space Complexity: O(n)
# Ran on Leetcode: Yes

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        first = {}
        second = {}
        s = s.split()
        if len(s) != len(pattern):
            return False
        for i in range(len(pattern)):
            if first.get(pattern[i]):
                if first[pattern[i]] != s[i]:
                    return False
            else:
                first[pattern[i]] = s[i]
            if second.get(s[i]):
                if second[s[i]] != pattern[i]:
                    return False
            else:
                second[s[i]] = pattern[i]
        return True
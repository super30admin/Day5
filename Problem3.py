# Problem 3:
# Given a pattern and a string str, find if str follows the same pattern.
# Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode :Yes

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        if(not s and not pattern):
            return True
        words = s.split()
        if(len(words) != len(pattern)):
            return False
        hashChar = {}
        hashSet = set()
        for i in range(len(pattern)):
            if pattern[i] not in hashChar:
                hashChar[pattern[i]] = words[i]
                if words[i] in hashSet:
                    return False
                else:
                    hashSet.add(words[i])
            else:
                if hashChar[pattern[i]] != words[i]:
                    return False
        return True

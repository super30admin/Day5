## Problem 3:
# Given a pattern and a string str, find if str follows the same pattern.
# Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

# Approach
# Create a hashmap and a hashset. Traverse through the pattern string and check if it is already mapped in hashmap. If yes, check if the value matches with the word in s string. If not, return False
# If the char is not mapped, check if the corresponding value is present in the hashset, if yes, return False because it meas that the value was alreasy mapped to another character
# Else, add the value of hashset and append the char and corresponding value in hashmap

# Time Complexity: O()
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        if len(pattern) != len(s.split(' ')):
            return False

        s = s.split(' ')
        l2w = {}
        hset = set()

        for i in range(len(pattern)):
            if pattern[i] in l2w:
                if l2w[pattern[i]] != s[i]:
                    return False
            else:
                if s[i] in hset:
                    return False
                hset.add(s[i])
                l2w[pattern[i]] = s[i]
        return True
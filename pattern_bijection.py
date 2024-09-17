# Did this code successfully run on Leetcode : YES
# TC: O(n) : One traversal over N elements of s and pattern simultaneously
# SC: O(n) : N-sized mapping and N-sized hashset to store s[i] for O(1) lookup

# Approach
# split s by spaces so that we have one-to-one mapping between pattern[i] and s[i]
# base case: lengths should be same
# if pattern[i] is present in mapping, it should point to the same s[i]
# if not, s[i] should not have been referenced by any other pattern[i]

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s = s.split()
        mapping = {}
        values_set = set()
        if len(s) != len(pattern):
            return False
        for i in range(len(pattern)):
            if pattern[i] in mapping:
                if mapping[pattern[i]] != s[i]:
                    return False
            else:
                if s[i] in values_set:
                    return False
                mapping[pattern[i]] = s[i]
                values_set.add(s[i])
        return True
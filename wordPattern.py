# Leetcode 290. Word Pattern

# Time Complexity :  O(log n) where n is the size of the array

# Space Complexity : O(1)

# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: Condition: Using two hashmaps, first one contains the letter from pattern as key
# and the word from str as value. The reverse is stored in second hashmap. If the key value mappings
# of the hashmaps dont match then return false else true

# Your code here along with comments explaining your approach

class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        hashmap1 = dict()
        hashmap2 = dict()
        words = str.split()

        if len(pattern) != len(words):
            return False

        for i in range(len(pattern)):
            if pattern[i] not in hashmap1:
                hashmap1[pattern[i]] = words[i]
            elif hashmap1[pattern[i]] != words[i]:
                return False

        for i in range(len(words)):
            if words[i] not in hashmap2:
                hashmap2[words[i]] = pattern[i]
            elif hashmap2[words[i]] != pattern[i]:
                return False
        return True

#create 2 hashmaps to store mapping from both pattern to s and s to pattern
#if a key does not exist in hashmap then add it in hashmap
#if a key exists but its mapping is different return false

#Time Complexity: O(n)
#Space Complexity: O(n)
#Leetcode: yes

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split(" ")
        if len(pattern) != len(words):
            return False
        
        pHash, wHash = {}, {}

        for i in range(len(pattern)):
            if pattern[i] not in pHash and words[i] not in wHash:
                 pHash[pattern[i]] = words[i]
                 wHash[words[i]] = pattern[i]
            elif pHash.get(pattern[i]) != words[i] or wHash.get(words[i]) != pattern[i]:
                return False
        return True
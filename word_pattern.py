 # Time Complexity : O(n)
 # Space Complexity : O(1)
 # Did this code successfully run on Leetcode : Yes
 # Any problem you faced while coding this : None
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        hashmap_pattern = {}
        hashmap_s = {}
        words = s.split(' ') #modifying [ate eat take] to ['ate','eat',take]
        if len(pattern) == len(words): # checking if length of pattern and string is equal
            for i in range(len(pattern)):
                if pattern[i] in hashmap_pattern:
                    if hashmap_pattern[pattern[i]] != words[i]: #key and value pairs doesnt match
                        return False
                else:
                    hashmap_pattern[pattern[i]] = words[i]

                if words[i] in hashmap_s:
                    if hashmap_s[words[i]] != pattern[i]:
                        return False
                else:
                    hashmap_s[words[i]] = pattern[i]
            return True 

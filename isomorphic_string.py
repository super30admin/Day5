"""
Time complexity: O(N) - we are iterating through the complete list
Space complexity: O(N) - size of the list
Code execution: Complete
No doubts
Explaination: Create two hash maps for every strig
map each character with each other in the hashmap
if the character already exists in the hashmap but does not match the new character, then mapping is wrong. Return False
else return True

"""
from collections import defaultdict


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        if s == None or t == None:
            return False
        hashmap_s = defaultdict()
        hashmap_t = defaultdict()
        for i in range(len(s)):
            if s[i] not in hashmap_s:
                hashmap_s[s[i]] = t[i]
            else:
                if hashmap_s[s[i]] != t[i]:
                    return False

        for j in range(len(t)):
            if t[j] not in hashmap_t:
                hashmap_t[t[j]] = s[j]
            else:
                if hashmap_t[t[j]] != s[j]:
                    return False
        return True


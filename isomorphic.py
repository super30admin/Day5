#create 2 hashmaps to store mapping from both s to t and t to s
#if a key does not exist in hashmap then add it in hashmap
#if a key exists but its mapping is different return false

#Time Complexity: O(n)
#Space Complexity: O(n)
#Leetcode: yes

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        sHash, tHash = {}, {}

        for i in range(len(s)):
            if s[i] not in sHash and t[i] not in tHash:
                sHash[s[i]] = t[i]
                tHash[t[i]] = s[i]
            elif sHash.get(s[i]) != t[i] or tHash.get(t[i]) != s[i]:
                return False
        return True
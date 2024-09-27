# TC: O(N)
# SC: O(1) cuz there are only 127 ascii characters
# leetcode: YES
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        hashmap = {}
        hashset = set()
        for i in range(len(s)):     
            if (not s[i] in hashmap) and t[i] in hashset:
                return False
            if s[i] in hashmap and t[i] in hashset:
                if hashmap[s[i]] != t[i]:
                    return False
            if s[i] in hashmap and  not t[i] in hashset:
                return False
            if not s[i] in hashmap:
                hashmap[s[i]] = t[i]
                hashset.add(t[i])
        return True
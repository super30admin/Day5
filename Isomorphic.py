#Time Complexity: O(n)
#Space Complexity: O(1)
#Successfully ran on leetcode

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False
        sChar = {}
        tChar = {}
        for i in range(len(s)):
            if s[i] not in sChar:
                sChar[s[i]] = t[i]
            elif s[i] in sChar and sChar[s[i]]!=t[i]:
                return False
            if t[i] not in tChar:
                tChar[t[i]] = s[i]
            elif t[i] in tChar and tChar[t[i]]!=s[i]:
                return False
        return True
# Time Complexity : O(n)
# Space Complexity : O(k) - k is the max number of keys
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        sToT,tToS = {},{}
        for i in range(len(s)):
            if s[i] in sToT.keys():
                if sToT[s[i]] != t[i]:
                    return False
            else:
                sToT[s[i]] = t[i]
            if t[i] in tToS.keys():
                if tToS[t[i]] != s[i]:
                    return False
            else:
                tToS[t[i]] = s[i]
        return True

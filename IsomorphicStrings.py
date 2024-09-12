"""
Time Complexity : O(n) 
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
"""
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        mainDictS = {}
        mainDictT = {}
        if len(s) != len(t):
            return False
        else:
            for i in range(len(s)):
                if s[i] not in mainDictS and t[i] not in mainDictT:
                    mainDictS[s[i]] = t[i] 
                    mainDictT[t[i]] = s[i]
                elif mainDictS.get(s[i]) != t[i] or mainDictT.get(t[i]) != s[i]:
                    return False
            return True
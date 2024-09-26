# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if s == None or t == None:
            return False
        if len(s) != len(t):
            return False

        sMap = {}
        tMap = {}

        for i in range(len(s)):
            sChar = s[i]
            tChar = t[i]

            if sChar in sMap:
                if sMap[sChar] != tChar:
                    return False
            else:
                sMap[sChar] = tChar
            
            if tChar in tMap:
                if tMap[tChar] != sChar:
                    return False
            else:
                tMap[tChar] = sChar

        return True
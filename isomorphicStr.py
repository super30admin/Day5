# TC: O(n)
# SC: O(n)
# Did it work on leetcode? Yes
# Any problems: No

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        if len(s) != len(t):
            return False
        else:
            sMap = {}
            tMap = {}

            for i in range(len(s)):
                if s[i] in sMap.keys():
                    if sMap[s[i]] != t[i]:
                        return False
                else:
                    sMap[s[i]] = t[i]

            for i in range(len(t)):
                if t[i] in tMap.keys():

                    if tMap[t[i]] != s[i]:
                        return False
                else: 
                    tMap[t[i]] = s[i]


            return True
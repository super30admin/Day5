#Time Complexity : O(n))
#Space Complexity : O(n) for the two dictionaries
#Did this code successfully run on Leetcode : yes
#Any problem you faced while coding this :

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        # table for keeping track of mapped characters
        mapForS = {}
        mapForT = {}
        if len(s) != len(t):
            return False

        for i in range(len(s)):
            currentChar = s[i]
            currentCharToMap = t[i]

            # if s[i] hasn't been mapped and neither has t[i]
            if currentChar not in mapForS and currentCharToMap not in mapForT:
                mapForS[currentChar] = currentCharToMap
                mapForT[currentCharToMap] = currentChar

            # preventing double mappings
            if currentChar not in mapForS and t[i] in mapForT:
                return False

            # a mapping already exists
            if currentChar in mapForS and mapForS[currentChar] != t[i]:
                return False

        return True
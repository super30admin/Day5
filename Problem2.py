'''
Time Complexity: O(n) where n is length of the string
Space Complexity: O(1)
Run on Leetcode: YES
'''
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sMap = {}
        tMap = {}
        for index in range(len(s)):
            sVal = s[index]
            tVal = t[index]
            if sVal in sMap.keys():
                if tVal != sMap[sVal]:
                    return False
            else:
                sMap[sVal] = tVal
                
            if tVal in tMap.keys():
                if sVal != tMap[tVal]:
                    return False
            else:
                tMap[tVal] = sVal     
        return True
# Time Complexity : O(n)
# Space Complexity : O(1) #At max 26 values in map
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :No

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        pMap = {}
        sMap = {}

        sArray = s.split(' ')

        if len(pattern) != len(sArray):
            return False
        
        for i in range(len(pattern)):
            if pattern[i] not in pMap:
                pMap[pattern[i]] = sArray[i]
            else:
                if pMap[pattern[i]] != sArray[i] :
                    return False

            if sArray[i] not in sMap:
                sMap[sArray[i]] = pattern[i]
            else:
                if sMap[sArray[i]] != pattern[i] :
                    return False
        return True
                




        
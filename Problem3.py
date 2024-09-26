# Time Complexity: O(n)
# Space Complexity: O(k) where k is all the unique word
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        sList = s.split(" ")
        patternMap = {}
        sMap = {}
        
        if(len(sList) != len(pattern)):
            return False
        
        for i in range(len(pattern)):
            if patternMap.has_key(pattern[i]) and patternMap[pattern[i]] != sList[i]:
                return False
            if sMap.has_key(sList[i]) and sMap[sList[i]] != pattern[i]:
                return False
            patternMap[pattern[i]] = sList[i]
            sMap[sList[i]] = pattern[i]
        
        return True
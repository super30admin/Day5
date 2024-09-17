#290. Word Pattern

# Time Complexity : O(1)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        hMap = {}
        sMap = {}
        s = s.split()
        if len(pattern) != len(s):
            return False
        for i in range(len(pattern)):
            print(hMap)
            if pattern[i] in hMap and hMap.get(pattern[i]) != sMap.get(s[i]):
                return False
            elif s[i] in sMap and hMap.get(pattern[i]) != sMap.get(s[i]):
                return False
            else:
                hMap[pattern[i]] = i
                sMap[s[i]] = i
                
        return True
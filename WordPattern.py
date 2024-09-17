# // Time Complexity : O(N) 
# // Space Complexity : O(N)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :


# // Your code here along with comments explaining your approach


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s = list(s.split())
        if len(pattern) != len(s):
            return False

        patternMap = dict()
        sMap = dict()
        

        for i in range(0, len(pattern)):
            # checking for Pattern Map
            if pattern[i] not in patternMap.keys():
                patternMap[pattern[i]] = s[i]
            else:
                if patternMap[pattern[i]] != s[i]:
                    return False
            # checking for String Map    
            if s[i] not in sMap.keys():
                sMap[s[i]] = pattern[i]
            else:
                if sMap[s[i]] != pattern[i]:
                    return False

        return True
#Time Complexity: O(n)
#Space Complexity: O(1)
#Successfully ran on leetcode

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        patternChar = {}
        s_array = s.split(" ")
        sString = {}
        if len(pattern)!=len(s_array):
            return False
        for i in range(len(pattern)):
            if pattern[i] not in patternChar:
                patternChar[pattern[i]]=s_array[i]
            elif patternChar[pattern[i]]!=s_array[i]:
                return False
            if s_array[i] not in sString:
                sString[s_array[i]]=pattern[i]
            elif sString[s_array[i]]!=pattern[i]:
                return False
        return True
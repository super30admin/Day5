# Time Complexity : O(n)
# Space Complexity : O(k) - k is the max number of keys
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        if len(s) == 0:
            return False
        str_array = s.split(" ")
        if len(pattern) != len(str_array):
            return False
        pToS,sToP = {},{}
        for i in range(len(pattern)):
            if pattern[i] in pToS.keys():
                if pToS[pattern[i]] != str_array[i]:
                    return False
            else:
                pToS[pattern[i]] = str_array[i]
            if str_array[i] in sToP.keys():
                if sToP[str_array[i]] != pattern[i]:
                    return False
            else:
                sToP[str_array[i]] = pattern[i]
        return True

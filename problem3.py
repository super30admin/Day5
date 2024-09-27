# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : N/A


# Your code here along with comments explaining your approach
# Same as isomorphing strings but not correspondence of letter with word

class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        strArry = str.split()
        
        if len(pattern) != len(strArry):
            return False
        
        dict1 = {}
        
        for i in range(len(pattern)):
            if pattern[i] not in dict1.keys():
                dict1[pattern[i]] = strArry[i]
            elif dict1[pattern[i]] != strArry[i]:
                print(pattern[i], strArry[i])
                return False
            
        dict2 = {}
        
        for i in range(len(strArry)):
            if strArry[i] not in dict2.keys():
                dict2[strArry[i]] = pattern[i]
            elif dict2[strArry[i]] != pattern[i]:
                print(strArry[i], pattern[i])
                return False
            
        return True
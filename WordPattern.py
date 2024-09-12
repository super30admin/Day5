// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        str=str.split(' ')
        sMap={}
        pMap={}
        if len(str)!=len(pattern):
            return False
        for i in range(len(str)):
            if pattern[i] not in sMap: # mapping 1:1 
                sMap[pattern[i]]=str[i]
            else:
                if sMap[pattern[i]]!=str[i]: # if mapping is overlapping, return False as value is already mapped to another key
                    return False
            
            if str[i] not in pMap:
                pMap[str[i]]=pattern[i] # mapping 1:1
            else:
                if pMap[str[i]]!=pattern[i]:  # if mapping is overlapping, return False as value is already mapped to another key
                    return False
        return True # if no condition fails in the loop , then pattern and string is matched so returns True
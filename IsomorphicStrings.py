// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sMap={}
        pMap={}
        if len(s)!=len(t):
            return False
        for i in range(len(s)):
            if s[i] not in sMap: # mapping 1:1 
                sMap[s[i]]=t[i] # if mapping is overlapping, return False as value is already mapped to another key
            else:
                if sMap[s[i]]!=t[i]:
                    return False
            if t[i] not in pMap: # mapping 1:1 
                pMap[t[i]]=s[i] # if mapping is overlapping, return False as value is already mapped to another key
            else:
                if pMap[t[i]]!=s[i]:
                    return False
        return True # if no condition fails in the loop , then pattern and string is matched so returns True
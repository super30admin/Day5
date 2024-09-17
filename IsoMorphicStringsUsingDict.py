# // Time Complexity : O(N) 
# // Space Complexity : O(N)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :


# // Your code here along with comments explaining your approach

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        if len(s) != len(t):
            return False
    
        sMap = dict()
        tMap = dict()
        
        for i in range(0, len(s)):
            # checking for s Map
            if s[i] not in sMap.keys():
                sMap[s[i]] = t[i]
            else:
                if sMap[s[i]] != t[i]:
                    return False
            # checking for t Map    
            if t[i] not in tMap.keys():
                tMap[t[i]] = s[i]
            else:
                if tMap[t[i]] != s[i]:
                    return False
                
        return True
        
        
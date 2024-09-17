
# // Time Complexity : O(N) 
# // Space Complexity : O(N)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :


# // Your code here along with comments explaining your approach
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        if len(s) != len(t):
            return False
    
        sMap = [0]*100
        tMap = [0]*100
        
        for i in range(0, len(s)):
            # checking for s Map
            if sMap[ord(s[i]) -ord(' ')]==0:
                sMap[ord(s[i]) -ord(' ')] = t[i]
            else:
                if sMap[ord(s[i]) -ord(' ')] != t[i]:
                    return False
            # checking for t Map    
            if tMap[ord(t[i]) -ord(' ')]==0:
                tMap[ord(t[i]) -ord(' ')] = s[i]
            else:
                if tMap[ord(t[i]) -ord(' ')] != s[i]:
                    return False
                
        return True
        
        
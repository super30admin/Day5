# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach
# Maintain two hashmaps for two way mappings
# if both the haspmap chek return true then its valid else not




class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        if  len(s) != len(t):
            return False
        sMap = {}
        tMap = {}
        
        for i in range(len(s)):
            
            if s[i] not in sMap.keys():
                sMap[s[i]] = t[i]
                
            if sMap[s[i]] != t[i]:
                return False
            
            if t[i] not in tMap.keys():
                tMap[t[i]] = s[i]
                
            if tMap[t[i]] != s[i]:
                return False
                
        return True
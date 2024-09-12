# Time Complexity = O(2n) = O(n)
# Space Complexity = O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        dic={}
        
        if len(s)!=len(t):
            return False
        
        for i in range(len(s)):
            
            c1,c2 = s[i],t[i]
            
            if c1 not in dic:
                
                if c2 in dic.values():
                    return False
                
                dic[c1]=c2
                
            elif dic[c1]!=c2:
                return False
        return True
Time Complexity : O(n)
Space Complexity : O(n)
Runs on LeetCode : Yes
Doubts :  No


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        if len(s) != len(t):
            return False
        
        dict1 = {}
        
        for i in range(len(s)):
            sx = "a" + s[i]
            tx = "b" + t[i]
            
            if sx not in dict1:
                dict1[sx] = i
                
            if tx not in dict1:
                dict1[tx] = i 
            
            if dict1[sx] != dict1[tx]:
                return False
        return True
    
            
        
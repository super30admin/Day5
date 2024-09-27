#Time Complexity : O(n)
#Space Complexity : O(n)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        hashMap = {}
        
        if len(s) != len(t):
            return False
        else:
            for i in range(len(s)):
                char1, char2 = s[i], t[i]
               
                if char1 not in hashMap:
                    if char2 in hashMap.values(): # if the same value is present for two keys
                        return False
                    hashMap[char1] = char2
                    
                else:
                    if hashMap[char1] != char2:
                        return False
                    
                
        return True
            

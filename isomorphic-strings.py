# Time complexity: O(n)
# Space complexity: O(n)

# The code ran on Leetcode successfully

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if s == None and t == None:
            return True
        
        if len(s) != len(t):
            return False
            
        sMap = {}
        tMap = []
        
        for i in range(len(s)):
            sChar = s[i]
            tChar = t[i]
            
            if sChar in sMap:
                if tChar in sMap:
                    return False
            
            else:
                sMap[sChar] = tChar
                
            if tChar in sMap:
                if sChar != sMap[sChar]:
                    return False
                
        return True
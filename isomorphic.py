Time Complexity: O(NKlogK)
Space Complexity:O(NK)
Code run on leetcode: Yes

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        from collections import defaultdict
        
        charMap = defaultdict(str)
        
        # Build dict of char translations
        for i in range(len(s)):
            if s[i] not in charMap and t[i] not in charMap.values():
                charMap[s[i]] = t[i]
        
        #Evaluate 
        for i in range(len(s)):
            if charMap[s[i]] != t[i] :
                return False
        
        return True
        
        
# Time Complexity : O(N) where N is the len(S) or len(T)
# Space Complexity : O(1) because dictionary can have maximum 26 keys.
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        if len(s) != len(t):
            return False
        
        d = {}
        for i in range(len(s)):
            sChar = s[i]
            tChar = t[i]
            
            if sChar in d:
                if d[sChar] != tChar: #tChar does not follow established mapping. Breaks isomorphism.
                    return False
            else:
                #if tChar already in d.values(). We are trying to map two chars in S to the same char in T
                if tChar in d.values():
                    return False
                else:
                    d[sChar] = tChar
        
        return True
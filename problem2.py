# Time Complexity : O(N), 
# Space Complexity :O(N)

# Did this code successfully run on Leetcode : 
# YEs

# Any problem you faced while coding this : 

# Your code here along with comments explaining your approach

#comparing Dictionary keys and value

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        m = len(s)
        n = len(t)
        d = {}
        for i in range(len(s)):
            if s[i] not in d.keys():
                if t[i] not in d.values():
                    d[s[i]] =  t[i]
                else:
                    return False
            else:
                if d[s[i]] != t[i]:
                    return False
        return True
        
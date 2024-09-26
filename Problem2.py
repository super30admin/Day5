## Problem 2:

#Time Complexity : O(n), where n is for the for loop
# Space Complexity : O(26) constant 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

#approach: Here, we use two dicts to keep for linking and corresponding the strings, 
from collections import defaultdict
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        d=defaultdict(str)
        e=defaultdict(str)
        if len(s)!=len(t):
            return False
        for i in range(len(s)):
            if s[i] not in d:
                d[s[i]]=t[i]
            else:
                if d[s[i]] != t[i]:
                    return False
                
            if t[i] not in e:
                e[t[i]]=s[i]
            else:
                if e[t[i]] != s[i]:
                    return False
        
        return True

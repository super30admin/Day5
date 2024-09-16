 # Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

#created a hashmap to save the occurence and matching character and if there 
#exists characted already the present ouccurence is matching or not matching
# if matching continue else return False
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        a = {}
        b = {}
        for i in range(len(s)):
            if s[i] not in a:
                a[s[i]] = t[i]
                if t[i] in b:
                    return False
                b[t[i]] = s[i]
            else:
                if a[s[i]] != t[i]:
                    return False
        return True
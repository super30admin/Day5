# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : N/A


# Your code here along with comments explaining your approach
#1. Checking if there is one to one correspondence from s to t
#2. Checking if there is one to one correspondence from t to s
#3. If both the correspondences are present the they are isomorphic
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        dicts = {}
        dictt = {}
        for i in range(len(s)):
            if s[i] not in dicts.keys():
                dicts[s[i]] = t[i]
            elif dicts[s[i]] != t[i]:
                return False
            
        for i in range(len(t)):
            if t[i] not in dictt.keys():
                dictt[t[i]] = s[i]
            elif dictt[t[i]] != s[i]:
                return False
            
        return True
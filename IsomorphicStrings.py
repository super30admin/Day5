'''
Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
'''

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        dic={}
        ric={}
        for i in range(len(s)):
            if s[i] in dic:
                if dic[s[i]] !=  t[i]:
                    return False
            else:
                dic[s[i]] =  t[i]
        
        for i in range(len(s)):
            if t[i] in ric:
                if ric[t[i]] !=  s[i]:
                    return False
            else:
                ric[t[i]] =  s[i]
                
        return True
        
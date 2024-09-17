#TimeComplexity:O(n)
#SpaceComplexity: O(n)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No
#Implement Stack using Array.
class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        L=[None for _ in range(1000)]
        S=[None for _ in range(1000)]
        for i in range(len(s)):
            if L[ord(s[i])]==None or L[ord(s[i])] == t[i]:
                L[ord(s[i])]=t[i]
            else: return False
            if S[ord(t[i])]==None or S[ord(t[i])] == s[i]:
                S[ord(t[i])]=s[i]
            else:return False
        return True              

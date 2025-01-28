'''
Time Complexity :   
O(n)
Space complexity :
O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
'''

class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        hash1={}
        n = len(s)
        if n!=len(t):
            return False
        for i in range(n):
            if s[i] not in hash1:
                if (t[i] in hash1.values()):
                    return False
                hash1[s[i]]=t[i]
            if hash1[s[i]]!=t[i]:
                return False
        return True
            
            
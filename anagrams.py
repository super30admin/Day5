class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        d1={}
        d2={}
        if len(s)!=len(t) or not s or not t:
            return false
        for i in range(0,len(s)):
            if s[i] not in d1:
                d1[s[i]]=t[i]
            if t[i] not in d2:
                d2[t[i]]=s[i]
            if d1[s[i]]!=t[i] or d2[t[i]]!=s[i]:
                return False
        return True
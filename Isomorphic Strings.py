class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        d = dict()
        g = dict()
        for i in range(len(s)):
            if(s[i] not in d):
                d[s[i]] = t[i]
            if(t[i] not in g):
                g[t[i]] = s[i]
            if(d[s[i]]!=t[i] or g[t[i]]!=s[i]):
                return False
        return True
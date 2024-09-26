# Time complexity: O(n)
# Space complexity: O(n)
class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if not len(s) == len(t):
            return False
        
        d = {}
        
        for i in range(len(s)):
            if t[i] not in d:
                if s[i] not in d.values(): 
                    d[t[i]] = s[i]
                else:
                    return False
            else:
                if not d[t[i]] == s[i]:
                    return False
        return True
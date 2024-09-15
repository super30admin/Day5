#LC 205 - Isomorphic Strings
#Time Complexity - O(n)
#Space Complexity - O(n)
class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if not s and not t:
            return True
        sd = {}
        vis = set()
        
        for i in range(len(s)):
            if s[i] not in sd.keys() and t[i] not in vis:
                sd[s[i]] = t[i]
                vis.add(t[i])
            elif s[i] in sd.keys():
                if sd[s[i]] != t[i]:
                    return False
            else:
                return False
        return True
            
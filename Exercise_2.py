   
    # 205. Isomorphic Strings

    # Time Complexity : O(1)
    # Space Complexity : O(1)
    # Did this code successfully run on Leetcode : Yes
    # Any problem you faced while coding this : No


class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s) != len(t) or s == None or t == None:
            return False
        
        sMap={}
        tMap={}
        for i in range(len(s)):
            if s[i] in sMap and sMap.get(s[i]) !=t[i]:
                return False
            else:
                sMap[s[i]] = t[i]
                
            if t[i] in tMap and tMap.get(t[i]) !=s[i]:
                return False
            else:
                tMap[t[i]] = s[i]
        return True
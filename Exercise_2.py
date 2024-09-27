# Time Complexity: O(n) 
# Space Complexity: O(1) -> space taken by hashmap or hashset is of fixed length 26 -> which is constant.
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this : No

class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        hashmap = {}
        hashset = set()
        
        #Base Case
        if len(s)!=len(t):
            return False
        
        for i in range(len(s)):
            if s[i] in hashmap:
                if t[i]!=hashmap[s[i]]:
                    return False
            else:
                if t[i] in hashset:
                    return False
                hashset.add(t[i])
                hashmap[s[i]] = t[i]
        return True
            
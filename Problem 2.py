
# Time Complexity: O(n)
# Space Complexity: O(1) # There can only be 26 characters
class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        dic_s = {}
        dic_t = {}
        for i in range(len(s)):
            if s[i] in dic_s:
                if dic_s[s[i]] != t[i]:
                    #print('s')
                    return False
            else:
                dic_s[s[i]] = t[i]
            if t[i] in dic_t:
                if dic_t[t[i]] != s[i]:
                    #print('t')
                    return False
            else:
                dic_t[t[i]] = s[i]
        return True
            
            

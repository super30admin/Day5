# Time Complexity : O(n) n = n is length of s
# Space Complexity: O(1) since there can at most be 26 keys.
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s_str = {}
        t_str = {}
        
        if len(s) != len(t) :
            return False
        for i in range(0,len(s)):
            if s[i] not in s_str.keys():
                s_str[s[i]] = t[i]
            else:
                if s_str[s[i]]!=t[i]:
                    return False
            
            if t[i] not in t_str.keys():
                t_str[t[i]] = s[i]
            else:
                if t_str[t[i]]!=s[i]:
                    return False
                
        return True
            
        
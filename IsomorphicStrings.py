//Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : NO
class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s)!=len(t):
            return False
        s_map={}
        t_map={}
        for i in range(0,len(s)) :
            s_ch=s[i]
            t_ch=t[i]
            if s_ch not in s_map:
                s_map[s_ch]=t[i]
            else:
                 if(s_map[s_ch]!=t[i]):
                        return False
            if t_ch not in t_map:
                t_map[t_ch]=s[i]
            else:
                if(t_map[t_ch]!=s[i]):
                    return False
        return True
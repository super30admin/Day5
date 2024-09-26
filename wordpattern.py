//Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : NO


class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        if len(pattern)==0:
            return False
        StringArray=s.split(" ")
        if(len(StringArray)!=len(pattern)):
            return False
        p_map={}
        s_map={}
        for i in range(0,len(pattern)):
            p=pattern[i]
            s=StringArray[i]
            if p not in p_map:
                p_map[p]=s
            else:
                if(p_map[p]!=s):
                    return False
            if s not in s_map:
                s_map[s]=p
            else:
                if(s_map[s]!=p):
                    return False
        return True
            
            
            
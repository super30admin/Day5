 #Time Complexity :O(n)
 #Space Complexity :O(n)
 #Did this code successfully run on Leetcode :Yes
 #Any problem you faced while coding this :No

class Solution(object):
    def isIsomorphic(self, s, t):
        hash1={}
        hash2={}
        if len(s) != len(t) or len(set(s)) != len(set(t)):
            return False
        for i in range(len(s)):
            if s[i] not in hash1:
                hash1[s[i]]=t[i]
                hash2[t[i]]=s[i] 
            else:
                if hash2[t[i]]!= s[i]:
                    return False
        return True
        
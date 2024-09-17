class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        
        '''// Time Complexity : O(n) where n is length of the string
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach'''
        
        #Create 2 hashmaps
        sMap=dict()
        tMap=dict()
        
        if len(s) != len(t):
            return False
        
        for i in range(len(s)):
            #Map in both the hashmaps
            if s[i] not in sMap.keys() and t[i] not in tMap.keys():
                sMap[s[i]]=t[i]
                tMap[t[i]]=s[i]
            #if the key already exists and if if it not equal to the mapped value then return False
            elif s[i] in sMap.keys() and sMap[s[i]] != t[i]:
                return False
            elif t[i] in tMap.keys() and tMap[t[i]] != s[i]:
                return False
        return True
            

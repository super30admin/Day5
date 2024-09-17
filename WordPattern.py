class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        
        '''// Time Complexity : O(n) where n is length of the string
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach'''
        
        #Create 2 hashmaps for the mapping
        patternMap=dict()
        sMap=dict()
        
        #Split the string s into array 
        sList=s.split(" ")
        
        if len(pattern)!=len(sList):
            return False
        
        #Same logic as Isomorphic strings
        for i in range(len(pattern)):
            if pattern[i] not in patternMap.keys() and sList[i] not in sMap.keys():
                patternMap[pattern[i]]=sList[i]
                sMap[sList[i]]=pattern[i]
            elif pattern[i] in patternMap and patternMap[pattern[i]] != sList[i]:
                return False
            elif sList[i] in sMap and sMap[sList[i]] != pattern[i]:
                return False
        return True
            
        

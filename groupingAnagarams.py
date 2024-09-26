
//Time Complexity : O(nklogk)
// Space Complexity :O(nk)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : NO
class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        if len(strs)==0:
            return [[]]
        m={}
        for i in strs:
            y="".join(sorted(i))
            
            if y not in m:
                m[y]=[]
            m[y].append(i)
        return m.values()
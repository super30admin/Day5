'''
Time Complexity :   
O(n)
Space complexity :
O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
'''

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        n = len(strs)
        dict1={}
        for i in range(n):
            val = ''.join(sorted(strs[i]))
            if val not in dict1:
                dict1[val]=[]
            dict1[val].append(strs[i])
        lst = []
        for key in dict1.keys():
            lst+=[dict1[key]]

        return lst
            
            
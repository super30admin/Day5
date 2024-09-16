# Time Complexity : O(nlogn)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : 
# Your code here along with comments explaining your approach

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        # Dictionary for two strings
        s_dic, t_dic = {}, {}
        
        #Store letters and indexes for both strings
        for i,val in enumerate(s):
            s_dic[val] = s_dic.get(val,[]) + [i]
        for i,val in enumerate(t):
            t_dic[val] = t_dic.get(val,[]) + [i]
        
        # Compare dictionary values to check for mapping
        return sorted(s_dic.values()) == sorted(t_dic.values())

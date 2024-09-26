#Time Complexity : O(n)
#Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no. here I used dictionary.

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        dic={}
        new_lis=[]
        for value in strs:
            new_str="".join(sorted(value))
            if new_str in dic:
                dic[new_str]+=[value]
            else:
                dic[new_str]=[value]
        
        return dic.values()
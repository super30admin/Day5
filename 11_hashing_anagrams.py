# S30 Big N Problem #11 {Medium}

# Given an array of strings, group all the anagrams together.

# Time Complexity : O(nlogn) n= no. of strings
# Space Complexity : O(n) n= no. of strings
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No 


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        dic={}
        
        for s in strs:
            
            # create a sorted tuple of chars in string
            sorted_s=tuple(sorted(s))
            
            # add it in the dictionary based on tne tuple value
            if dic.get(sorted_s,-1)==-1:
                dic[sorted_s]=[]
                dic[sorted_s].append(s)
            else:
                dic[sorted_s].append(s)
        
        # create a result array to store the array of strings
        res=[] 
        for val in dic.values():
            res.append(val)
        
        return res
        
        
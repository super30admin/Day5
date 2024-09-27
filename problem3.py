# Time Complexity : O(L), L is length of pattern 
# Space Complexity :O(L), L is length of pattenrn

# Did this code successfully run on Leetcode : 
# YEs

# Any problem you faced while coding this : 

# Your code here along with comments explaining your approach

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        dict1 = {}
        dict2 = {}
        for key,value in enumerate(list(s.split(" "))):
            if value not in dict1:
                dict1[value]= [key]
            else:
                dict1[value].append(key)
            
        for key,value in enumerate(pattern):
            if value not in dict2:
                dict2[value]= [key]
            else:
                dict2[value].append(key)
        return (list(dict1.values()) == list(dict2.values()))
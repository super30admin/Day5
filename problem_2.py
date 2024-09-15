""" Time Complexity : O(n)
 Space Complexity : O(n)
 Did this code successfully run on Leetcode :Yes
 Any problem you faced while coding this : No 
"""
        

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        char_map_x = {}
        char_map_y = {}
        
        for i,j in zip(s,t):
            
            if i in char_map_x.keys():
                if j != char_map_x.get(i):
                    return False
            elif j in char_map_y.keys():
                if i != char_map_y.get(j):
                    return False
                
            char_map_x[i] = j
            char_map_y[j] = i
            
        return True
                
        
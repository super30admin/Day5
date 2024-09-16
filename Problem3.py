# Time Complexity : O(nlogn)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : 
# Your code here along with comments explaining your approach

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        # Dictionary for pattern and string
        pattern_dic, s_dic = {}, {}
        # Store indices of letter as value with key as letter
        for i, ele in enumerate(pattern):
            if ele not in pattern_dic:
                pattern_dic[ele] = [i]
            else:
                pattern_dic[ele] += [i]
                
        # Convert s to list of words
        s_list = s.split(" ")
     
        # Store indices of word as value with key as word
        for i, ele in enumerate(s_list):
            if ele not in s_dic:
                s_dic[ele] = [i]
            else:
                s_dic[ele] += [i]
                
        print(sorted(pattern_dic.values()))
        print(sorted(s_dic.values()))
        
        # Compare dictionary values
        return sorted(pattern_dic.values()) == sorted(s_dic.values()) 

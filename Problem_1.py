"""

    Student : Shahreen Shahjahan Psyche

    Time Complexity : NKlogK ; K is number of characters in each word and
                               N is number of words 
    Space Complexity: O(KN)

    This program successfully passed all test cases in Leetcode.


"""

from typing import List


class Solution:
     
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        if strs is None or len(strs) == 0:
            return
        records = {}
        for i in strs:
            list_i = sorted(list(i)) # Time Complexity : K log K
            temp = "".join(list_i) 
            if temp in records.keys():
                records[temp].append(i)
            else:
                records[temp] = [i]
                
        res = []
        for i in records.values():
            res.append(i)
        
        return res
        
            
        
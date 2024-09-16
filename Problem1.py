# Time Complexity: O(NK)
# Space Complexity: O(NK)
# Passed Leetcode: Passed

import collections
class Solution:

        
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        if len(strs) == 0:
            return []   
        output = {}
        
        for value in strs:
            count = [0] * 26
            
            for s in value:
                count[ord(s) - ord("a")] += 1
            
            if tuple(count) in output:
                output[tuple(count)].append(value)
            else:
                output[tuple(count)] = [value]
            
        return output.values()           
            
        
        
                    
            
        
        
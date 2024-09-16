# Time Complexity : O(n k log k), where N is the length of strs, and K is the maximum length of a string in strs. 
#                   The outer loop has complexity O(N)as we iterate through each string. 
#                   Then, we sort each string in O(K \log K)O(KlogK) time.
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No

from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        dict1=defaultdict(list)
        for itm in strs:
            sorted_str=''.join(sorted(itm))
            print(sorted_str)
            if sorted_str not in dict1:
                dict1[sorted_str].append(itm)
            else:
                dict1[sorted_str].append(itm)
        return dict1.values() 
            
            
        
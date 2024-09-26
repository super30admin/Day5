"""

Time Complexity : O(n * klog(k)) where "n" is number of strings in array, "k" is length of each string, klog(k) is for sorting string with size "k". 
Space Complexity : O(n * k)
    
"""

from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        d = defaultdict(str)
        
        for i in strs:
            string = "".join(sorted(list(i)))
            
            if not d[string]:
                d[string] = [i]
                continue 
            
            d[string].append(i)
        
        return [x for x in d.values()]
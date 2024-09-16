"""
Group Anagrams
TIME COMPLEXITY : O(N+N*log(N)) 
SPACE COMPLEXITY: O(N*logN)
LEETCODE        : Passed all cases    
DIFFICULTIES    : Nope
"""


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        w_map = {}
        op = []
        
        for each_str in strs: # N
            a = sorted(each_str) # klog(k)
            a = tuple(a)
            if a in w_map.keys(): 
                idx = w_map[a]
                op[idx].append(each_str)
            else:
                op.append([each_str])
                w_map[a] = len(op)-1
                
        return op
                
        

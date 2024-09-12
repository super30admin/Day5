#time complexity: O(N*M) N- length of array M -length of string
#space complexity: O(N)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No

from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = {}
        for i in range(0, len(strs)):
            count = [0] * 26
            for ch in strs[i]:
                count[ord(ch)-ord('a')] += 1
            tup = tuple(count)
            if tup in res:
                res[tup].append(strs[i])
            else:
                res[tup] = [strs[i]]
        
        return res.values()
        
            
                
        
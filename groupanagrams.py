# Time Complexity = O(n) 
# Space Complexity = O(n) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        d={}
        
        for i in strs:
            x="".join(sorted(i))
            
            if x in d:
                d[x].append(i)
            
            else:
                d[x]=[i]
        return list(d.values())
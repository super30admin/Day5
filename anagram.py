# Time Complexity = O(n) 
# Space Complexity = O(n) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def groupAnagrams(self, strs):
        
        result = {}
        
        for i in strs:
            
            # sort each strind 
            x = "".join(sorted(i))
            
            # check if the sorted key exists, if yes append the value 
            if x in result:
                result[x].append(i)
                
            # else create a new list for the sorted key
            else:
                result[x] = [i]
                
        return list(result.values())
# Time Complexity : O(nklogk)
# Space Complexity : O(nk)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : N/A


# Your code here along with comments explaining your approach
# sort each word and store it in hashmap
# While inserting in haspmap create use sorted word as key and array of anagrams as value
# Iterate over hashmap and create required array of result
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        sets = []
        result = []
        
        for item in strs:
            temp = list(item)
            temp.sort()
            index = None
            if temp in sets:
                index = sets.index(temp)
            else:
                sets.append(temp)
            if index is None:
                result.append([item])
            else:
                result[index].append(item)
        
        return result
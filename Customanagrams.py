# // Time Complexity : O(N) where N is length of the list of strings.
# // Space Complexity : O(N) where N is length of the list of strings.
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach
#Sort the each string in the list and add as key and the value as the original word. Check the next string with the sorted and if exists then append the new original string.



import collections
from typing import List


class Solution:
    
    
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:        
        anagramsHashMapList = collections.defaultdict(list)
        for word in strs:
                      
            sortedword= sorted(word)
            sortedwordjoin =''.join(sortedword)
            if sortedwordjoin not in anagramsHashMapList:                     
                anagramsHashMapList[sortedwordjoin] = []

            anagramsHashMapList[sortedwordjoin].append(word)
        
        return anagramsHashMapList.values()
            

obj = Solution()   
print(obj.groupAnagrams(["eat","tea","tan","ate","nat","bat"]))






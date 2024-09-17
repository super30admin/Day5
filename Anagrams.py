# // Time Complexity : O(N) 
# // Space Complexity : O(N)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :


# // Your code here along with comments explaining your approach


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        stringMap = dict()
        for i in range(0, len(strs)):
            sortedStr = ''.join((sorted(strs[i])))
            if sortedStr not in stringMap.keys():
                stringMap[sortedStr] =[]
                stringMap[sortedStr].append(strs[i])
            else:
                stringMap[sortedStr].append(strs[i])
        
        return list(stringMap.values())
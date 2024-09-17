# # Hashing-1

# ## Problem 1:
# Given an array of strings, group anagrams together.

# Example:
# Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
# Output:
# [
#   ["ate","eat","tea"],
#   ["nat","tan"],
#   ["bat"]
# ]

# Note:
# All inputs will be in lowercase.
# The order of your output does not matter.

# Solution 1:

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dic={}
        for i in strs:
            print(i)
            s = ''.join(sorted(i))
            if s not in dic:
                dic[s] = [i]
            else:
                dic[s].append(i)   
        output = []
        for i,j in dic.items():
            output.append(j)
    
        return output
    
# Time Complexity -> o(nklogk) where k is the number of mappings 
# Space Complexity -> o(nk) where k is the number of mappings









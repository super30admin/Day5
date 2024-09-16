# Group Anagrams (https://leetcode.com/problems/group-anagrams/)
# Time complexity: O(n * klogk); n=no of elements in list ; k = length of string 
# Space complexity: O(m); m=no of unique sorted strings  
# Did this code successfully run on Leetcode : Yes
# Approach: Hashing.
# Loop through all the strings in list, and make its sorted value as key and itself as the value.
# It will look something like this :
# {('a,e,r': [are, ear, era])}

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        ana_dic = {}
        
        
        for i in range(len(strs)):
            sorted_str = sorted(strs[i])
            
            if tuple(sorted_str) in ana_dic:
                ana_dic[tuple(sorted_str)].append(strs[i])
            else:
                ana_dic[tuple(sorted_str)] = [strs[i]]
                
        print(ana_dic)
        return ana_dic.values()
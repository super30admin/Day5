"""
Author: Srinidhi Bhat
Space Complexity: O(n) - used extra hashmap
Time Complexity: O(n) - iterating through the string array, retrival is O(1) so only loop time complexity
Did it run on Leetcode: Yes

Logic:
1) Anagrams are strings with the same letters
so for anagrams, we can just maintain the letters as key and value as list of strings with same letters
"""

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if len(strs)==0:
            return []
        
        ans = []
        
        my_dict = {}
        #key must be immutable, hence must store it in tuple form
        for string in strs:
            my_dict[tuple(sorted(string))] = my_dict.get(tuple(sorted(string)),[]) + [string]
        
        for val in my_dict.values():
            ans.append(val)
        return ans
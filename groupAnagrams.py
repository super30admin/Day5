"""
Time Complexity : O(n klogk), where n is the length of the list and k is the length of the string
Space Complexity : O(nk)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this: none

Problem:
Given an array of strings, group anagrams together.

Example:
Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]

Note:
All inputs will be in lowercase.
The order of your output does not matter.


"""

class Solution:
    def groupAnagrams(self, strs):
        if len(strs) == 0:
            return []
        
        hashmap = {}
        
        for s in strs:
            key = ''.join(sorted(s))
            
            if key not in hashmap:
                hashmap[key] = [s]
            else:
                hashmap[key].append(s)
                
        return list(hashmap.values())
    
s = Solution()
print(s.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))
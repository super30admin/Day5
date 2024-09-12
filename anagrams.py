 # Time Complexity : O(n*k log(k))
 # Space Complexity : O(n*k)
 # Did this code successfully run on Leetcode : Yes
 # Any problem you faced while coding this : None
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashmap = {} # empty hashmap
        for string in strs:
            sorted_str = "".join(sorted(string)) # sorting strings
            if sorted_str not in hashmap: # if key not found
                hashmap[sorted_str] = []
                hashmap[sorted_str].append(string)
            else: # if key found
                hashmap[sorted_str].append(string)
        return hashmap.values() # returns list of groupAnagrams

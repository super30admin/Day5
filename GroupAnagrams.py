# Time Complexity: O(n * k log k), where n is the number of strings and k is the maximum length of a string.
# Space Complexity: O(n * k), due to the hash map storing up to n keys with strings of length k.
# Approach: Used a hash map with sorted tuples of characters as keys to group anagrams together efficiently.

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map = {}
        
        for astr in strs:
            sortedString = tuple(sorted(astr))
            
            if sortedString not in map:
                map[sortedString] = []
            
            map[sortedString].append(astr)
        
        return list(map.values())

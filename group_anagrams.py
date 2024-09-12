'''
Problem statement: Grouping anagrams in the array
TC: O(n)
SC : O(n) : Taking auxillary data structure: Hashmap
'''

class Solution:
    def groupAnagrams(self, strs):
        hashmap = {}
        for i in strs:
            if "".join(sorted(i)) not in hashmap:
                hashmap["".join(sorted(i))] = [i]
        
        result = [i for i in hashmap.values()]
        return result
        
        result = [i for i in hashmap.values()]
        return result
        
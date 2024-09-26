'''
Time Complexity: O(n*klogk)
Space Complexity: O(n)

Create a key:value pairs where key is the sorted string 
Compare the rest of the strings with key after sorting.
If there is a match, append the values are list in the dictionary
and return at the end.
'''

class Solution:
    def groupAnagrams(self, strs):
        groups = defaultdict(list)
        for s in strs:
            key = "".join(sorted(s))
            groups[key].append(s)
        return groups.values()
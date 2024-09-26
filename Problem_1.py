# Group Anagrams Together

# Time Complexity : O(NKlogK), where NN is the length of strs, and KK is the maximum length of a string in strs.
# Space Complexity : O(NK)
# Did this code successfully run on Leetcode : Yes, Runtime: 88 ms and Memory Usage: 17.9 MB
# Any problem you faced while coding this : Yes, In finding Space and Time Complexity
# Your code here along with comments explaining your approach
# Approach
"""
In this problem from collections defaultdict is used with list as an argument which provides
a default value for the key that does not exists.
first each word is sorted, use sorted word as key and list is converted into tuple and then append original word in a map. 
The value of the map will be a list containing all the words which have same word after sorting. 

"""
from collections import defaultdict
class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        Words=defaultdict(list)
        for word in strs:
            Words[tuple(sorted(word.lower()))].append(word)
            
        return Words.values()

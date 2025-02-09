# Problem 1 - Group Anagrams
# Time Complexity : O(nklog k)
# Space Complexity : O(nk)
# Did this code successfully run on Leetcode : Yes
# Explain your approach in **three sentences only** at top of your code :
'''
In this approach, we use a hashmap where the key is the sorted version of a string, and the value is the original string (which, 
when sorted, matches the key). For each string, we first sort it and then check if the sorted string already exists as a key in 
the hashmap. If the key is not present, we create a new key, associate the string with it as the value, and finally return a list 
of values corresponding to all the keys in the hashmap.
'''

# Your code here along with comments explaining your approach
from typing import List
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # HashMap for storing the string as value and sorted string as key
        mapString = {}
        for s in strs:
            # Stored the string in string list
            sortedStringChar = sorted(s)
            sortedString = "".join(sortedStringChar)
            # Checking in the hashmap if the sorted string is present or not
            if (not(sortedString in mapString)):
                # If the sorted string is not present then create the new key with sort string
                mapString[sortedString] = []
            # Added the string as a value to the sorted string key
            mapString[sortedString].append(s)
        # Get the values of the hashmap for every key and store in the result list
        result = list(mapString.values())

        return result
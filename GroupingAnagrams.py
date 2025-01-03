# Time Complexity : O(nk log(k)), where n is the number of strings in strs, and k is the avg length of a string in strs
# Space Complexity : O(nk), , where n is the number of strings in strs, and k is the avg length of a string in strs
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA

# Your code here along with comments explaining your approach:
# using one hashmap to solve this problem where the key is the sorted string and the value is a list of all original string sthat if sorted give the same sorted string
# first, taking every string from the given list of strings and sorting them, then checking if the key already exists in the map
# if it does not exist, we initialize it as a list of strings and add the original string as the value in the value list
# if it exists, we append the current original string to the value list (because one string is already mapped and the list is already initialized)

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        anagram = {}

        if (strs is None or len(strs) == 0):
            return anagram 
        
        for i in range(len(strs)):
            # take a string from strs and sort it
            sortedStr = sorted(strs[i]) # returns a list
            # so we need to convert this list back to a string
            sortedStr = ''.join(sorted(strs[i]))
            
            # now we check if the sortedStr is present as a key
            if sortedStr not in anagram:
                # key does not exist
                # so we add it
                anagram[sortedStr] = [strs[i]] # initializing as a list of actual strings
            else:
                # we append the current original string to the value list of the sorted string key
                anagram[sortedStr].append(strs[i])

        # returning the list of all values in the anagram map
        return list(anagram.values())



        

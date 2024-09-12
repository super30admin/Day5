#Time Complexity : O(NLOG(N)) FOR SORTING THE ELEMENT And O(N)for traversing the strs 
#Space Complexity : O(N)
# Code Ran in Leetcode :Yes
# Procedure:

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        element = {}    #Initialize Dictionary
        for s in strs:  # Run a loop 
            key = ''.join(sorted(s))  # sort each strs and store in key 
            if key not in element:  # If condition is checked if key is there in dict element 
                element[key] = [s]   # If not store the strs in that particular key       
            else:
                element[key].append(s)  # else if key is already present append the str in that particular key
        return element.values()
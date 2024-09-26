#Time Complexity : O(nlogn), not entirely sure of the exact complexity
#Space Complexity : O(n) for the dictionary and resultList
#Did this code successfully run on Leetcode : yes
#Any problem you faced while coding this : understanding the time complexity in terms of the length of the strings, I have an intuition that its nlogn
#because we are sorting


# Your code here along with comments explaining your approach

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        resultDict = {}
        resultList = []

        # loop through each string in the list and sort it, then turn it into a tuple for hashing
        for string in strs:
            key = tuple(sorted(string))
            if key in resultDict:
                resultDict[key].append(string)
            else:
                resultDict[key] = []
                resultDict[key].append(string)

        # the keys here will be tuples, and the values will be the anagrams. we just append them to our result list
        for elem in resultDict.values():
            resultList.append(elem)

        return resultList
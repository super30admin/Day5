# Time Complexity :O(mLog(m)*n)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no


# Your code here along with comments explaining your approach

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        helper = {}
        for i in strs:
            #create a key from the sorted letters of the string
            myKey = ''.join(sorted(i))
            #if in helper dictionary append the unsorted word
            if myKey in helper:
                helper[myKey].append(i)
            else:
            #else create a new group of anagrams
                helper[myKey] = [i]
        return helper.values()
        
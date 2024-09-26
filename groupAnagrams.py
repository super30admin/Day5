# Time Complexity : O(n(log(n)))
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No problem

# Given an array of strings, group anagrams together.
# Example: Input: ["eat", "tea", "tan", "ate", "nat", "bat"], Output: [ ["ate","eat","tea"], ["nat","tan"], ["bat"] ]
# Note: All inputs will be in lowercase. The order of your output does not matter.

class Solution(object):
    def groupAnagrams(self, strings):
        """
        create a hashmap with key as sorted string and value as a list of values
        when a new string comes, check whether it exists in the hashmap or not, if it exists add the values to the list of the values for that hashed string
        """

        lookup = {} # {sorted_string1: (string1, string2), sorted_string2: (string3)}
        retList = []
        for string in strings:
            sorted_string = ''.join(sorted(string))
            if sorted_string in lookup:
                lookup[sorted_string].append(string)
            else:
                lookup[sorted_string] = [string]
        
        for val in lookup.values():
            retList.append(val)
        
        return retList


obj = Solution()
strings = ["eat", "tea", "tan", "ate", "nat", "bat"]
print(obj.groupAnagrams(strings))


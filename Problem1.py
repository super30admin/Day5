# Time Complexity : O(n * klogk)
# Space Complexity : O(n * k) n - number of strings, k - average length of the strings
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        result = {}
        for str in strs:
            sortedStr = ''.join(sorted(str)) # Sort the string and use it as the key

             # If the sorted string is not in the result, initialize it as an empty list
            if sortedStr not in result:
                result[sortedStr] = []

            result[sortedStr].append(str) # Append the original string to the list of anagrams

        return list(result.values()) # Return the list of values (which are lists of anagrams)
             
        
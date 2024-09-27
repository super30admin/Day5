# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # Hashtable to store words
        dict = {}
        # Iterate through the wwords and sort the word and check if the sorted word exists in the table
        for i in strs:
            # Sort the word
            word = "".join(sorted(i))
            # If the word exists, add it to that words table
            if word in dict:
                dict[word].append(i)
            # Else create a new table for that word
            else:
                dict[word] = [i]
        # Array to hold our return values
        retArr = []
        # Iterate through the Hashtable and add the values to the return array
        for k, v in dict.items():
            retArr.append(v)
        return retArr

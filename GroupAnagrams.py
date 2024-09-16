# Time Complexity : O(NKlogK) where N is the number of strings in array and K is the length of each string and logK for sorting
# Space Complexity : O(NK) for storing each string in dictionary and K for storing the sorted string as key
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
# I have used hashmap for storing each sorted string as key.
# Check if the string matches the sorted key and store it as value for the key


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dict = {}
        for i in range(len(strs)):
            strsSorted = sorted(strs[i])
            strsSorted = ''.join(strsSorted)
            if strsSorted not in dict:
                dict[strsSorted] = [strs[i]]
            else:
                dict[strsSorted].append(strs[i])

        return dict.values()

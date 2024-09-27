# // Time Complexity : O(nllogl) Where l is the length of the string
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :
#
#
# // Your code here along with comments explaining your approach

# Using Sorting Technique
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if strs == None or len(strs) == 0:
            return []
        hashmap = {}
        sorted_list = []
        for word in strs:
            sorted_list.append(''.join(sorted(word)))

        for i in range(len(strs)):
            if sorted_list[i] not in hashmap.keys():
                hashmap[sorted_list[i]] = []
                hashmap[sorted_list[i]].append(strs[i])
            else:
                hashmap[sorted_list[i]].append(strs[i])
        return hashmap.values()



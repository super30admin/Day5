// Time Complexity :O(nk)
// Space Complexity :O(nk)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : we have different approaches for hashing including the method discussed in the class using prime 
// numbers and all. finding the optimal way is bit challenging.
// Your code here along with comments explaining your approach
// I have followed the count strategy for solving this, where we map each letter to a number and hashmap using count of word.
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        result = collections.defaultdict(list)
        for s in strs:
            count = [0] * 26
            for c in s:
                count[ord(c) - ord('a')] += 1
            result[tuple(count)].append(s)
        return list(result.values())
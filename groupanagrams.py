# Time Complexity : O(NlogN)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No



from collections import defaultdict
class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        result = []
        anagrams = defaultdict(list)
        
        for word in strs:
            anagrams["".join(sorted(word))].append(word)
            
        for value in anagrams.values():
            result.append(value)
            
        return result
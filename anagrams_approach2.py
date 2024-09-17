#Time Complexity :  O(NK)  # iterate through every element and calculate product of each word
#Space Complexity : O(NK)
#Did this code successfully run on Leetcode : yes
#Any problem you faced while coding this : no

from collections import defaultdict
class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        anagrams = defaultdict(list)
        prime_list = [2, 5, 3, 11, 7, 17, 13, 23, 19, 31, 29, 41, 37, 47, 43, 59, 53, 67, 61, 73, 71, 83, 79, 97, 89, 101]
        for s in strs:
            k = 1
            for c in s:
                k = k* prime_list[ord(c)-97]
            anagrams[k].append(s)
            
        return anagrams.values()
                
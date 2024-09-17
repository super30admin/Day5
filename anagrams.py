#Time Complexity :  O(NKlogK)  # iterate through every element and sort each word let k be size of word
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
        similar_words = defaultdict(list)
        for s in strs:
           
            word = ''.join(sorted(s))
            similar_words[word].append(s)
        return similar_words.values()
                
            
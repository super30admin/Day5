 #Time Complexity :O(n)
 #Space Complexity :O(1)
 #Did this code successfully run on Leetcode :Yes
 #Any problem you faced while coding this :No
class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        table = {}
        for word in strs:
            sorted_word = "".join(sorted(word))
            if sorted_word in table:
                table[sorted_word].append(word)
            else:
                table[sorted_word]= [word]
                
        return table.values()
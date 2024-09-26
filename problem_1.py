"""
Approach : for ever string in strs sort all the letters in the string.

Works on Leetcode

Time Complexity :O(n*mlogm) m size of word n : number of words

Space Complexity : O(mn)


"""
class Solution(object):
    def hash(self,a):
        return "".join(sorted(a))
        
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        result_map = {}
        
        for i in strs:
            key = self.hash(i)
            if key not in result_map.keys() :
                result_map[key] = []
            result_map[key] += [i]
        
        return result_map.values()

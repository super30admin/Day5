
#Time Complexity :O(n*mlogm) m size of word n : number of words
#Space Complexity : O(mn)
#Leetcode submission:succesful
class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        #empty dictionary and we store the key as the sorted words 
        d= {}
        for str in strs:
            key = ''.join(sorted(str))
            if key in d:
                d.get(key).append( str )
            else:
                d[key] = [str]
        return d.values()
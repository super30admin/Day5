#Approach : A hashmap with key value with sorted chars and value is a list of strs which has sample chars. return the list of list
#Time Complexity : O(n)
#Space Compleixty : O(n)

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        anagram_dict = {}
        result =[]
        for i in strs :
            sorted_arr = tuple(sorted(i))
            #print (sorted_arr)
            if sorted_arr in anagram_dict:
                anagram_dict[sorted_arr].append(i)
            else:
                anagram_dict[sorted_arr] = [i]
                
        for i in anagram_dict:
            result.append(anagram_dict[i])
        return result

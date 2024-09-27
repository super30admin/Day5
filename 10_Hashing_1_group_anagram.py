#Time Complexity : O(N*KlogK) N is the number of words and K is the length of word
#Space Complexity : O(NK)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : 

#Your code here along with comments explaining your approach




class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        dict={}
        for word in strs:
            sorted_word="".join(sorted(word))
            if sorted_word not in dict:
                dict[sorted_word]=[word]
            else:
                dict[sorted_word].append(word)
        
        result=[]
        for item in dict.values():
            result.append(item)
            
        return result    
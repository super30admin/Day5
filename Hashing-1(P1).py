# -*- coding: utf-8 -*-
"""
Created on Tue Mar 23 13:24:38 2021

@author: jgdch
"""

#Time Complexity:O(NK), where N is the length of the input array and K is the max length of a string in the input array
#Space Complexity: O(NK), as we are storing the mapping for each string in input array
#Passed all leetcode testcases successfully
"""
Solution:
For each word in the array, we have a charater array where it updates the count for each character.
We map the character array for the word and the words which are anagrams should have a same character array and will map to a same key.

"""
class Solution:
    def groupAnagrams(self,strs):
        
        word_map={}
        for word in strs:
            word_array=self.getArray(word)
            if word_array in word_map:
                word_map[word_array].append(word)
            else:
                word_map[word_array]=[word]
        return word_map.values()
            
            
    
    def getArray(self,word):
        char_array=[0]*26
        for char in word:
            char_array[ord(char)-ord("a")]+=1
        return tuple(char_array)
            
                
            
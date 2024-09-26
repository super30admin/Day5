'''
====== Submission Details =======
Student Name: Pavan Kumar K. N.
S30 SlackID : RN32MAY2021
=================================
'''

#-------------  
# Explanation:
#-------------
#49. Group Anagrams

# Given an array of strings strs, group the anagrams together. 
#You can return the answer in any order.

# An Anagram is a word or phrase formed by rearranging the letters of 
# a different word or phrase, typically using all the original letters exactly
# once.

# Example 1:
# Input: strs = ["eat","tea","tan","ate","nat","bat"]
# Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

# Example 2:

# Input: strs = [""]
# Output: [[""]]
# Example 3:

# Input: strs = ["a"]
# Output: [["a"]]

# Constraints:

# 1 <= strs.length <= 104
# 0 <= strs[i].length <= 100
# strs[i] consists of lower-case English letters.

#-----------------
# Time Complexity: 
#-----------------
# O(MN): N items in input, M is max size of each input word
#------------------
# Space Complexity: 
#------------------
# O(M+N) - Space to store hashmaps for each item and then each key in the item

#-----------------------
# Leet Code Performance: 
#-----------------------
# Ran Successfully?: Yes
# Time             :  120 ms (21.14 %ile)
# Space            :  16.9 MB (99.59 %ile)

from typing import List

class Solution:
    def __init__(self):
        self.map = {}
        self.input_list = []
        self.primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, \
        43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103]
    
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        self.input_list = strs
        for word in self.input_list:
            key = 1
            for char in word:
                key *= self.primes[ord(char)-ord('a')]

            if key in self.map:
                self.map[key].append(word)
            else:
                self.map[key] = [word]
        
        result = []
        for key in self.map.keys():
            result.append(self.map[key])

        return result

obj = Solution()
print(obj.groupAnagrams(["eat","tea","tan","ate","nat","bat"]))




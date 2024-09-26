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
# O(MNLogM): N items in input, M is max size of each input word
#------------------
# Space Complexity: 
#------------------
# O(M+N) - Space to store hashmaps for each item and then each key in the item

#-----------------------
# Leet Code Performance: 
#-----------------------
# Ran Successfully?: Yes
# Time             :  116 ms (26.64 %ile)
# Space            :  17.2 MB (90.14 %ile)
from typing import List

class Solution:
    def __init__(self):
        self.map = {}
        self.input_list = []
    
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        self.input_list = strs
        
        # Looping through each element in input_list: O(N)
        for input_str in self.input_list:
            temp_map = {}
            
            # Looping through each character in input_str: O(M)
            for char in input_str:
                # in operation is O(1) on dict in Python 3.x
                if char in temp_map:
                    temp_map[char] += 1
                else:
                    temp_map[char] = 1
            char_count_key = ''
            
            # Sorting the keys in temp_map : LogM
            
            # Here, In Java or C++, We could store a HashMap<HashMap, Array> 
            # This would remove the need for this sort operation
            for char_count in sorted(temp_map.keys()):
                char_count_key += char_count
                if temp_map[char_count]>1:
                    char_count_key += str(temp_map[char_count])
            # print (f"char_count_key: {char_count_key}")

            if char_count_key in self.map:
                self.map[char_count_key].append(input_str)
            else:
                self.map[char_count_key] = [input_str]

        # print(self.map)

        result = []
        
        # Worst case: O(N)
        for anagrams in self.map.keys():
            result.append(self.map[anagrams])

        return result

obj = Solution()
print(obj.groupAnagrams(["eat","tea","tan","ate","nat","bat"]))



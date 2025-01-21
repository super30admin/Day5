"""
Given an array of strings strs, group the 
anagrams together. You can return the answer in any order.

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]

Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Example 2:

Input: strs = [""]

Output: [[""]]

Example 3:

Input: strs = ["a"]

Output: [["a"]]

Time Complexity : O(N*M*Log(M))
Space Complexity : O(N*M)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

"""

# The function groups words that are anagrams of each other by sorting each word and using it as a key in a dictionary.  
# Words with the same sorted form are stored in a list under the same key, ensuring anagrams are grouped together.  
# Finally, the values of the dictionary (lists of anagrams) are returned as the output.  


class Solution:  
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:  
        d = {}  # Dictionary to store grouped anagrams  

        for i in strs:  
            tmp = ''.join(sorted(i))  # Sort characters to create a unique key for anagrams  
            if tmp not in d:  
                d[tmp] = [i]  # Create a new key with the current word  
            else:  
                d[tmp].append(i)  # Append to existing list if key exists  

        return list(d.values())  

# Time Complexity : O(N * M logM) (where M is length of longest word and N is total number in the input list)
# Space Complexity : O(NM) 
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english:
# - Use dictionary to store similer anagram.
# - Use sorted string as the key and group of anagram as value.
# - In the end run for loop on dictionary to get group of anagram and append it to the answer list.

from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
#       Initialize default dictionary
        data = defaultdict(list)
        
#       Loop over every word.
        for string in strs:
#           Sort the word to get the key
            key = ''.join(sorted(string))
#           append word to the corresponding list fetched from dictionary with given key
            data[key].append(string)
                
        ans = []
        
#       Loop over dictionary and append list storing group of anagram
        for val in data.values():
            ans.append(val)
            
        return ans
        

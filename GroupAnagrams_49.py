'''
time = O(N*klogk)--> for looping through the whole list and sorting in alphabetical order

space = O(N*K) -- constant space for 26 characters

Ran in Leetcode -- yes

Did you face any issues -- No
'''

from typing import List

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        strDict = {}
        result = []
        for word in strs:
            strDict.setdefault("".join(sorted(word)),[]).append(word)

        return(list(strDict.values()))

  
obj = Solution()
strs = ["eat","tea","tan","ate","nat","bat"]
print(obj.groupAnagrams(strs))

  
obj = Solution()
strs = ["eat","tea","tan","ate","nat","bat"]
print(obj.groupAnagrams(strs))
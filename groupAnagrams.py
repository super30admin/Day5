Group Anagrams

Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]

Note:

    All inputs will be in lowercase.
    The order of your output does not matter.

Space:O(mn)
Time:n*mlogn
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if strs == None or len(strs) == 0:
            return 0
        hashMap = {}
        for s in strs:
            key = "".join(sorted(s)) # sorted the string
            if key not  in hashMap:# check whther the string in dict is not add
                hashMap[key] = [s]
                
            else: # is the strs contains in dict append the str in the values
                 hashMap[key].append(s)
        return hashMap.values()

                
        

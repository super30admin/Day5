#Time Complexity: O(nklogk) here n -> length of array and k is length of string
#Space complexity : O(nk)

from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram = defaultdict(list)
        
        for s in strs:
            #check whether key is present or absent and here the key is sorted
            if ''.join(sorted(s)) not in anagram.keys():
                anagram[''.join(sorted(s))] = [s]
            else:
                anagram[''.join(sorted(s))] += [s]
        return anagram.values()
                

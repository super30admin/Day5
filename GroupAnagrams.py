#Time complexity: O(n*klogk) ; n->number of strings ; k->string length of n strings.
#Space complexity: O(n*k)
#Leetcode: Yes


from collections import defaultdict

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram_dict = defaultdict(list)

        for s in strs:
            key = ''.join(sorted(s))
            anagram_dict(key).append(s)
        
        return list(anagram_dict.values())
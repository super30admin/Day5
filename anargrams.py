from typing import List
from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagramhashmap = defaultdict(list)
        for element in strs:
            anagramhashmap["".join(sorted(element))].append(element)
        return anagramhashmap.values()

if __name__ == '__main__':
    print(Solution().groupAnagrams(["eat","tea","tan","ate","nat","bat"]))




    #space:-------------O(nk)
    #timecomplexity:----O(nklogk
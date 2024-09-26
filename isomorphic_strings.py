# time complexity - O(N * KLOGK) WHERE N IS NO.OF STRINGS AND K IS LEN OF LONGEST STRING
# space complexity - O(N*K)
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrams = {}
        for string in strs:
            sorted_str = ''.join(sorted(string))
            # print(sorted_str)
            if sorted_str not in anagrams:
                anagrams[sorted_str] = []
            anagrams[sorted_str].append(string)
        return list(anagrams.values())
    
        
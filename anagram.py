"""
Given an array of strings, group anagrams together.

Time = O(NKlogK), N= len(strs), K= max len of string in strs 
Space = O(NK)

Successfully executed in leetcode

Approach ---
1. Create HashMap/ dictionary - Use the sorted anagram as a key and the anagrams themselves as the values

anagrams = {'aet': ['eat', 'tea', 'ate'], 'ant': ['tan', 'nat'], 'abt': ['bat']})

"""

class Anagrams:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        anagrams = defaultdict(list)
        for word in strs:
            anagrams[''.join(sorted(word))].append(word)
        print("anagrams",anagrams)
        return list(anagrams.values())
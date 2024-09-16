class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        anagram=collections.defaultdict(list)

        for s in strs:
            anagram[tuple(sorted(s))].append(s) #key will sorted string

        return anagram.values()

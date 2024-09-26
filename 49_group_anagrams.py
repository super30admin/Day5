class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrams = {}; anagram = []
        for ag in strs:
            agl = list(ag)
            agl.sort()
            agl = "".join(agl)

            if agl in anagrams:
                anagrams[agl].append(ag)
            else:
                anagrams[agl] = [ag]
        
        for k in anagrams:
            anagram.append(anagrams[k])
        return anagram
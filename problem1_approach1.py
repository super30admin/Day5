#time complexity: O(NKlogK) where N is the length of strs and K is the maximum length of a string in strs
#space complexity: O(NK)

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        anagrams = defaultdict(list)

        for word in strs:
            
            sortedWord = "".join(sorted(word))

            anagrams[sortedWord].append(word)
        
        return list(anagrams.values())
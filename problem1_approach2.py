# time complexity: O(NK) where N is the length of strs and K is the maximum length of a string in strs
# space complexity: O(NK)

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        anagrams = defaultdict(list)

        for word in strs:
            count = [0]*26

            for char in word:
                count[ord(char)-ord('a')] += 1
            
            anagrams[tuple(count)].append(word)
        
        return list(anagrams.values())

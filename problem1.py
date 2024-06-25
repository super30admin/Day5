# time: O(n2)
# space: O(n2)
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dicti = collections.defaultdict(list)
        
        for s in strs:
            word = [0]*26
            for c in s:
                word[ord(c)-ord('a')]+=1
            
            dicti[tuple(word)].append(s)
            
        
        return dicti.values()

        
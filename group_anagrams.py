class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        
        anagrams = {}
        
        for word in strs:
            
            sortedWord = "".join(sorted(word))
            
            if sortedWord in anagrams:
                anagrams[sortedWord].append(word)
            
            else:
                anagrams[sortedWord] = [word]
                
        
        return list(anagrams.values())
            
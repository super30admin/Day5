class Solution:
    
    def sortWord(self,word):
            sortedWord = ''.join(sorted(word))
            return sortedWord
    
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        # Create a dictionary
        newDict = dict()
        
        # Iterate the words in dictionary
        for word in strs:
            
            # Sort the word
            sortedWord = self.sortWord(word)
            
            # Insert if sorted-word is not in newDict
            if sortedWord not in newDict:
                # Insert into newDict
                newDict[sortedWord] = []
            
            newDict[sortedWord].append(word)
        
        # Noew return the output as list
        
        resultList = []
        for key in newDict:
            resultList.append(newDict[key])
        
        return resultList
                
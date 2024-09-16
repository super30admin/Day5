class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        dataStore = dict()
        
        for word in strs:
            sortedWord = "".join(sorted(word))
            
            if not sortedWord in dataStore:
                dataStore[sortedWord] = list()

            dataStore[sortedWord].append(word)
        
        solution = []
        
        for key, values in dataStore.items():
            solution.append(values)
        
        return solution
    
    
# Approach is to create a hashmap for each sorted word as key and anagram of that sorted word as values
# Initially we check if for a particular sorted word, there is no key, we create a key and add an empty list as value
#  Now for each word whose sorted value is that key, we append into the list 


#  Time complexity is O(n) + klogk as time is needed to only load the values in the hashmap and sorting takes time klgk
# where k is avg length of the word.
        
        

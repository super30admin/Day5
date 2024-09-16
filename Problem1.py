# Time Complexity: O(N)
# Space Complexity: O(N)
# Leetcode all test cases passed: Yes
# Any difficulties: No

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dic = {}
        for word in strs:
            sortedWord = "".join(sorted(word))      # Storing the sorted in a new variable
            if sortedWord in dic:                   # Using the sorted variable as key
                dic[sortedWord].append(word)        # If the sorted variable exists, it is an anagram, add to the existing key
            else:
                dic[sortedWord] = [word]            # If not, its a new word, add to a new key
        return dic.values()
    
    
        
        

#Time and space complexity O(n)
#was able to run on leetcode
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
#Initializing dictionary for storing keys and values
        dict={}
# Iterating through the loop        
        for i in strs:
# sorting elements and checking if its there in the dictionary else creating new key of sorted element and assigning it values likewise
            sorted_word="".join(sorted(i))
            
            if sorted_word not in dict:
                dict[sorted_word]=[i]
            else:
                dict[sorted_word].append(i)
#Final result will be stored in dictionary values                     
        return list(dict.values())

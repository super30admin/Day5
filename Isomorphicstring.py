class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # created an empty dict
        dict = {}
        for word in strs:
            #sort the values in the given string 
            sortedword = "".join(sorted(word))
            #check if the sorted value is present in dict if not add to dict
            if sortedword not in dict:
                dict[sortedword] = [word]
            #now add the original str to dict with key as sorted value
            else:
                #dict[sortedword] = []
                dict[sortedword].append(word)
                #dict[key].append(strVal) 
        result =[]
        #loop through the dict and add them to results and return it
        for item in dict.values():
              result.append(item)
        return result
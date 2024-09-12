
# // Time Complexity : # we will have O(m.nlogn) complexity, where m is length of the aaray and n is length of the string
# // Space Complexity :O(n)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : no

class Anagram:
    # Input: strs = ["eat","tea","tan","ate","nat","bat"]
    def groupAnagrams(self,strs):

        #dictionary to  store wordpattern and similar list of words:
        dictA={}

        for s in strs:
#to convert list values and sort then as a string
            sortedword=" ".join(sorted(s))
#check if sortedword patternis already in the dictionary 
            if sortedword in dictA:
                #append the original word as a value for the matched word pattern
                dictA[sortedword].append(s)
            else:
                #add the word pattern along with its word
                dictA[sortedword]=[s]
                
        #now when we have words in dict we have to return only values, so take a result array which will store only the values correspond to the word pattern
        result=[]

        for v in dictA.values():
            result.append(v)
        return result


s=Anagram()
strs = ["eat","tea","tan","ate","nat","bat"]
print(s.groupAnagrams(strs))







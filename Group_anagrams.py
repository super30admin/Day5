# Aproach 1 : Sorted order to the list of word
# Executed successfully
# TC:O(n.klogk +k) here n is total number of words and klogk is sorted that we are performing and + k is for looking in hasmap
# SC:O(n)



class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        grouped={}
        #create a dict

        for word in strs:
            sorted_word=''.join(sorted(word))
            #always sort word 
            print(sorted_word,"sorted string")
            if sorted_word in grouped:
                # add word to it's associated sorted word if sorted word is already there else add it
                grouped[sorted_word].append(word)
                print(grouped,"if sorted word exists then add that word")
            else:
                grouped[sorted_word]=[word]
                print(grouped," if sorted word not there add that dict as key")
                
        return grouped.values()
        #return list(grouped.values())
#Both return same output as ds in ds is reference
# that's why same result    
# Approach 2 : Product of Prime Numbers
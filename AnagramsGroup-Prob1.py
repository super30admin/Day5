class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        result= {}
        # Using Dictionary
        for word in strs:
           # print (st)
            key = "".join(sorted(word))
           # print("key value is   ", key)
            
            if key not in result:
                result[key] = [word]
                #print("result for new. ", words_dict)
                
            else:
                result[key].append (word)
                #print("result for exist . ", words_dict)
                
                
        return result.values()
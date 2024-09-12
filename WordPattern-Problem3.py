


# dictionary approach 
        # Time complexity: O(n)
        # Space complexity: O(n)
class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        
        #Splitting the given sentence into words
        splitstr = str.split(" ")

        #Edge Case
        if  len(splitstr) != len(pattern):
            return False
        
        dict_res = {} # key is the pattern, value is the word
        #Logic
        for i in range(len(splitstr)):
            if pattern[i] not in dict_res:
                
                if splitstr[i] not in dict_res.values():
                    #Mapping pattern char to each word (key-pattern, value-word) 
                    dict_res[pattern[i]] = splitstr[i]
                else:
                    return False
            #if there is pattern and that patter value not equal to current word
            else:
                if  dict_res[pattern[i]] !=splitstr[i]:
                    return False
        return True
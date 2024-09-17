"""
Given a pattern and a string str, find if str follows the same pattern. Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Time = O(N); N = number of words in str
Space = O(M); M = number of unique characters in pattern and unique word in str

Successfully executed in leetcode

Approach ---
Single index hash map/ dictionary

1. Keep track of first occurence in pattern and each word in str. 
2. Go through each character(in pattern) and word(in str_list), insert each unseen character from pattern and unseen word from str_list
3. Check indices of each character and word match up. As we find a mismatch, we can return False.
4. If we reach the end of for loop without returning False, that means we don't have mistach. So return True at the end

"""



class WordPattern:
    def wordPattern(self, pattern: str, str: str) -> bool:

        dictionary = {}
        str_list = str.split()

        if len((pattern)) != len((str_list)):  # edge case : pattern = "abb"; str = "dog cat cat dog"          
            return False
        
        if len(set(pattern)) != len(set(str_list)): # edge case : pattern = "abba"; str = "dog dog dog dog"      
            return False
        
        for i in range(len(pattern)): # Map unseen character as key with word from str_list as value
            if pattern[i] not in dic:
                dictionary[pattern[i]] = str_list[i]
            else:
                continue
        #print("dictionary",dictionary)
        
        
        for i in range(len(pattern)): #Iterate through each character in pattern and match the word
            #print("ele",dictionary[pattern[i]],str_list[i])
            if dictionary[pattern[i]] == str_list[i]: # When dictionary[character] == word then continue
                #print("here")
                continue
            else:
                #print("there")
                return False
        return True

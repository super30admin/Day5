#Approach 1: One hashmap and one hashset
# dict and set in python 
#TC: O(n)
#SC: O(n)

class Solution:
    def wordPattern(self, pattern: str, str_: str) -> bool:
        words=str_.split()
        #Split the words first 

        if len(words)!=len(pattern):
            return False
        #for isomorphic and word-pattern length should always be same

        maps={}
        #use a map and set 
        # in map will be having mappings and set will store str_ elements 
        # for example: will only do mapping if set doesnot contain that word, if it already does that means another char is mapped with it already
        set_vals=set()

        for i in range(len(pattern)):
            char=pattern[i]
            word=words[i]

            if char in maps:
                # first will check if that char is in map 
                if maps[char]!=word:
                    # and if doesnot match with word in associate with it then return False
                    return False
            else:
                if word in set_vals:
                    # will also return if we already have that word in set because set has property to store unique and it does contain word then already been mapped so return false
                    return False
            #If none of cases are there means it's new mapping so we add new mapping and that word in set
                maps[char]=word
                set_vals.add(word)
        #finally we return true if above condition check is done and no breach reached then perfectly following word pattern
        return True
    

#Approach 2 : Two dict

class Solution:
    def wordPattern(self, pattern: str, str_: str) -> bool:
        words=str_.split()

        if len(words)!=len(pattern):
            return False

        # maps={}
        # set_vals=set()

        char_to_word={}
        word_to_char={}


        for i in range(len(pattern)):
            char=pattern[i]
            word=words[i]

            if char in char_to_word:
                if char_to_word[char]!=word:
                    return False
            else:
                 char_to_word[char]=word
            
            if word in word_to_char:
                if word_to_char[word]!=char:
                    return False
            else:
                word_to_char[word]=char
        return True


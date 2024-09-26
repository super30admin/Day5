"""
Name: Srinidhi Bhat 
Space Complexity: O(n) 
Time Complexity: O(n)

Did it run on Leetcode:Yes
Logic: We need to maintain both word to char mapping and char to word mapping.
With one hashmap we can ensure char -> word mapping
but the problem is when same word is mapped to differen chars
"abbc"
"Apple Apple Apple Apple"
But if we maintain a seperate dictionary for word to char mapping, this can be eliminated.
"""
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        char_to_word = {}
        word_to_char = {}
        
        #removing the addtional space in the string
        words = s.split(' ')
        if len(words)!=len(pattern):
            return False
        
        for char,word in zip(pattern,words):
            #this is the case when the char is not seen, but word is already
            #aabb -> Dog,Dog,Dog,Dog
            #Dog is already assigned to a hence cannot be to b, hence false
            if char not in char_to_word:
                if word in word_to_char:
                    return False
                
                else:
                    #storing both the relations in map
                    char_to_word[char] = word
                    word_to_char[word] = char
            else:
                if char_to_word[char]!=word:
                    return False
        return True
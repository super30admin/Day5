"""
Intuition: 

Method 1:Use hashmap. Check association for word to char and char to word. 
For both techniques, to get the hashvalue of the word, multiple a prime form factor with the ASCII of the character.
#####################################################################
Method 1: Using a 2 hashmaps
Time Complexity : O(W), where N = number of words
Space Complexity : O(W*C) * O(W*C) = 2*O(W*C)  = O(W*C) where W = number of words, C = average number of characeters in a word
#####################################################################
Method 2: Using a hashmap and a hashset
Time Complexity : O(W), where W = number of words
Space Complexity : O(W*C) * O(W*C) = 2*O(W*C)  = O(W*C) where W = number of words, C = average number of characeters in a word
#####################################################################
"""

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:        
        s_list = s.split(" ")
        
        if len(s_list) != len(pattern):
            return False
        hashMap_CHAR_TO_WORD = {}
        hashMap_WORD_TO_CHAR = {}
        for index in range(len(pattern)):
            char = pattern[index]
            word = s_list[index]
            
            if char not in hashMap_CHAR_TO_WORD:
                hashMap_CHAR_TO_WORD[char] = word
            
            if hashMap_CHAR_TO_WORD[char] != word:
                return False
            
            
            if word not in hashMap_WORD_TO_CHAR:
                hashMap_WORD_TO_CHAR[word] = char
            
            if hashMap_WORD_TO_CHAR[word] != char:
                return False
            
            
        return True
            
##################
#Using a hashmap and a hashset
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:        
        s_list = s.split(" ")
        
        if len(s_list) != len(pattern):
            return False
        hashMap_CHAR_TO_WORD = {}
        hashset_WORD_TO_CHAR = set()
        for index in range(len(pattern)):
            char = pattern[index]
            word = s_list[index]
            if char not in hashMap_CHAR_TO_WORD:
                
                if word in hashset_WORD_TO_CHAR:
                    return False
                else:
                    hashset_WORD_TO_CHAR.add(word)
                hashMap_CHAR_TO_WORD[char] = word
            else:
                if word != hashMap_CHAR_TO_WORD[char]:
                    return False
            
        return True
    
            
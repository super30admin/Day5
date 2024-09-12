# k is average length of all the words
# n - no of words or len(pattern)
# m - no of unique words
# Time Complexity - O(nk)
# Space Complexity - O(mk)
# Did it run successfully - Yes
# Any problems faced None
# Approach using 2 hash maps 
# 1 to store ch to word mapping
# 1 to store word to char mapping
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        char_to_word = {}
        word_to_char = {}
        
        # string to list of word strings
        words = s.split(" ")
        if len(words) != len(pattern):
            return False
        
        for ch, word in zip(pattern, words):
            # check if char is present in the mapping
            if ch in char_to_word:
                # if present and mapping is not word
                if char_to_word[ch] != word:
                    return False
            else:
                # put the ch to the mapping
                char_to_word[ch] = word
            
            # Check if word is present
            if word in word_to_char:
                # mapping is not equal to given char
                if word_to_char[word] != ch:
                    return False
            else:
                word_to_char[word] = ch
                    
        return True
        
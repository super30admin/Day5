class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        words = s.split()
        
        # Check if lengths match
        if len(pattern) != len(words):
            return False
            
        char_to_word = {}
        word_to_char = {}
        
        # Check pattern matching
        for char, word in zip(pattern, words):
            if char not in char_to_word:
                if word in word_to_char:
                    return False
                char_to_word[char] = word
                word_to_char[word] = char
            elif char_to_word[char] != word:
                return False
                
        return True

Time Complexity: O(n) - because it iterates through the pattern and words once using zip
Space Complexity: O(n) - because it uses two hash maps that can store up to n items

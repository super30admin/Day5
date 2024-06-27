#The wordPattern function checks if a given string str follows a specified pattern pattern by ensuring a bijection (one-to-one mapping) between characters in pattern and words in str separated by spaces. It first splits str into individual words and compares the lengths of pattern and words; if they differ, it returns False. Two dictionaries, pattern_to_word and word_to_pattern, track mappings between characters and words bidirectionally. As it iterates through each character and word pair, it checks and updates these mappings. If inconsistencies are found (e.g., a character maps to a different word or vice versa), it returns False. Time Complexity: O(n), Space Complexity: O(n).

def wordPattern(pattern, str):
    words = str.split()
    
    if len(pattern) != len(words):
        return False
    
    pattern_to_word = {}
    word_to_pattern = {}
    
    for char, word in zip(pattern, words):
        if char in pattern_to_word:
            if pattern_to_word[char] != word:
                return False
        else:
            pattern_to_word[char] = word
        
        if word in word_to_pattern:
            if word_to_pattern[word] != char:
                return False
        else:
            word_to_pattern[word] = char
    
    return True


print(wordPattern("abba", "dog cat cat dog")) 
print(wordPattern("abba", "dog cat cat fish"))
print(wordPattern("aaaa", "dog cat cat dog")) 
print(wordPattern("abba", "dog dog dog dog")) 

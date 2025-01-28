# Input: pattern = "abba", s = "dog cat cat dog"
# Output: True


def wordPattern(pattern, s):
    # declare two dictionary first 
    char_to_word = {}
    word_to_char = {}


    #split words in strings array 
    words = s.split()

    # check if the length of pattern and words are the same
    if len(pattern) != len(words):
        return False

    for char, word in zip(pattern,s):
        if char in char_to_word and char_to_word[char] != word:
            return False
        if word in word_to_char and word_to_char[word] != char:
            return False
        
        char_to_word[char] = word
        word_to_char[word] = char
    return True


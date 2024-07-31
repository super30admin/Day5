# Convert string to list
# have two dictionaries / hashmap. one tracks the pattern, another tracks the word
# Check mapping from both sides of word <> pattern and pattern <> word

# Time Complexity - O n
# Space COmplexity - O n

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:

        # hashmap to track mapping of char to pattern
        mapChar = {}

        # hashmap to track mapping of pattern to char
        mapWord = {}

        # split function

        # store words in a list
        listWords = []

        temp = ''
        for char in s: 
            if(char != ' '):
                temp+=char
            else:
                listWords.append(temp)
                temp = ''

        # Append the last word if there is one
        if temp:
            listWords.append(temp)

        if len(pattern) != len(listWords):
            return False
            

        # Iterate over the pattern and corresponding words
        for i, word in enumerate(listWords):
            char = pattern[i]

            if char in mapChar:
                if mapChar[char] != word:
                    return False
            else:
                mapChar[char] = word

            if word in mapWord:
                if mapWord[word] != char:
                    return False
            else:
                mapWord[word] = char

        return True
        

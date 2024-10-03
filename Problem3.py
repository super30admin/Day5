# TC AND SC O(n)

class Solution:
    def wordPattern(self, pattern, string):
        wordsInString = string.split(" ")
        letterToWord = {}
        stringToWord = {}
        if len(pattern) != len(wordsInString):
            return False
        
        for letter, word in zip(pattern, wordsInString):
            print(letter,"is mapped to ",word)
            if letter in letterToWord:
                if letterToWord[letter] != word:
                    return False
            else:
                letterToWord[letter] = word
            
            if word in stringToWord:
                if stringToWord[word] != letter:
                    return False
            else:
                stringToWord[word] = letter
            

        return True
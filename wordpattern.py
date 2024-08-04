# Time Complexity - O (n)

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:

        mapChar = {}

        mapWord = {}

        listWords = []

        temp = ''
        for char in s: 
            if(char != ' '):
                temp+=char
            else:
                listWords.append(temp)
                temp = ''

        if temp:
            listWords.append(temp)

        if len(pattern) != len(listWords):
            return False

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
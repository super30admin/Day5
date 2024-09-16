class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        letter_2_word = {}
        word_2_letter = {}
        if len(pattern) != len(s.split()):
            return False
        for c, word in zip(pattern, s.split()):
            letter_2_word[c] = letter_2_word.get(c, word)
            word_2_letter[word] = word_2_letter.get(word, c)
            if letter_2_word[c] != word or word_2_letter[word] != c:
                return False
        return True
        
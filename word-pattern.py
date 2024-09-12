class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        word_split = s.split(" ")
        word_map = {}
        count = 0
        for letter in pattern:
            if letter not in word_map:
                word_map[letter] = word_split[count]
            elif word_map.get(letter)!=word_split[count]:
                return False
            count = count + 1
        return True
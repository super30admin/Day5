# O(N) TIME AND O(N) SPACE WHERE N IS LEN(PATTERN) OR LEN(S)
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split(" ")
        if len(pattern) != len(words):
            return False
        mappings = {}
        used_words = set()
        for i in range(len(pattern)):
            if pattern[i] not in mappings:
                if words[i] in used_words:
                    return False
                mappings[pattern[i]] = words[i]
                used_words.add(words[i])
            else:
                if mappings[pattern[i]] != words[i]:
                    return False
        return True
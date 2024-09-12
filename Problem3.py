class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        word = s.split(" ")
        d1 = {}
        d2 = {}
        if len(word) == len(pattern):
            for i in range(len(pattern)):
                val1 = pattern[i]
                val2 = word[i]

                if (val1 in d1 and d1[val1] != val2) or (val2 in d2 and d2[val2] != val1):
                    return False
                
                d1[val1] = val2
                d2[val2] = val1

        else:
            return False

        return True
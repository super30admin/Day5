#time complexity = O(n)
#space complexity = O(n)

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:

        words = s.split(" ")          # we split the word in string s
        if len(words) != len(pattern):  # base case
            return False
        hash1 = {}  # initilize hash map
        hash2 = {}  # initilize hash map
        for i in range(len(pattern)):
            c1 = pattern[i]  # assign c1 for all char in str pattern
            c2 = words[i]    # assign c2 for all char in str words
            if ((c1 in hash1 and hash1[c1] != c2) or (c2 in hash2 and hash2[c2] != c1)):
                return False
            hash1[c1] = c2    # assign c1 in hash1 to c2
            hash2[c2] = c1    # assign c2 in hash1 to c1

        return True
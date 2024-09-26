# Approach: 
        # We are solving this problem in a similar way to the "Isomorphic Strings" problem.
        # We use two dictionaries to map characters from the pattern to words in the string 
        # and vice versa. If there is any mismatch between the pattern-word mapping, 
        # we return False. Otherwise, return True at the end.
        
        # SC: O(n) where n is the number of unique characters/words in pattern and s
        # TC: O(n) where n is the length of the pattern (or s, since both should have the same length)

class Solution(object):
    def wordPattern(self, pattern, s):
        s = s.split(" ")
        mapPS, mapSP = {}, {}

        for i in range(len(pattern)):

            c1, c2 = pattern[i], s[i]

            if((c1 in mapPS and mapPS[c1] != c2) or 
                (c2 in mapSP and mapSP[c2] != c1) or
                len(pattern) != len(s)):
                return False

            mapPS[c1] = c2
            mapSP[c2] = c1
        
        return True
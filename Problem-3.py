"""
Approach:
The approach here is same as that of problem 2
goal is to check if there is a perfect 1 to 1 mapping of the chars of tha pattern and the
word split of the string. We use 2 hash maps in order to track 2 directional
mapping

0) if the number of words do not match with the len of pattern, then we return false
1) split the string to get words separated by spaces
2) store words and mapping char in hashmap 1
3) Store char of pattern and mapping word in hashmap 2
4) if word exists already it should have been mapped to the same char, use HM-1 to check this
5) if char exists already it should have been mapped to the same word, use HM-1 to check this

"""

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        pattern_map = {}
        string_map = {}

        if len(s.split()) != len(pattern): return False

        for i, word in enumerate(s.split()):
            if word not in string_map:
                string_map[word] = pattern[i]

            elif string_map[word] != pattern[i]:
                return False

            if pattern[i] not in pattern_map:
                pattern_map[pattern[i]] = word

            elif pattern_map[pattern[i]] != word:
                return False
            print(string_map)

        return True

"""
Time Complexity:O(n) where n is the number of chars in given string
Space Complexity: O(n)
"""
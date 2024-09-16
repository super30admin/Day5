"""
Runtime Complexity:
O(m*k) - where 'm' is the number of character which maps to 'k' characters in 's' string. 
Space Complexity: O(n*k) where n is the number of words which contain 'k' characters. This is because we split the given 's' string and store as separate words and map each character 
from pattern to words of 's' string. 
Yes, the code worked on leetcode.
The idea behind the algorithm is we check whether the character is already present in p_map which is a hashmap which containts mapping from character in p to words
in 's'. But if the character is not present in p_map but there is a mapping for a word in s_map, this means that the word is already mapped with different character and return false.
If a new character or word is encountered then we update/add to the hashmaps. We check if each character in p_map maps to word in s_map, if not we return false else true.
"""


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s = s.split(" ")
        p_map = {}
        s_map = {}
        if len(s)!=len(pattern):
            return False
        for p_char,s_char in zip(pattern,s):
            if p_char not in p_map:
                if s_char in s_map:
                    return False
                else:
                    p_map[p_char] = s_char
                    s_map[s_char] = p_char
            else:
                if p_map[p_char]!=s_char:
                    return False
        return True

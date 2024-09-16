# Word Pattern (https://leetcode.com/problems/word-pattern/)
# Time complexity: O(n); n=no of elements in string 
# Space complexity: O(m); m=no of unique patterns in string 
# Did this code successfully run on Leetcode : Yes
# Approach: 
# 1) Loop through all the characters in "pattern" 
# 2) Set each char in 'pattern" as key. Store word at the position in "s" as its value
# 3) Set each word in 's" as key. Store character at the position in "pattern" as its value
# 4) Check if the word or character is present in the hashmap. If yes then check if its value matches the corresponding value in "pattern" or "s" 

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        dic = {}
        words = s.split(" ")
        
        if len(pattern) != len(words):
            return False

        for i in range(len(pattern)):
            c = pattern[i]
            w = words[i]
            
            char_c = 'char_' + c
            char_w = 'word_' + w
            
            if char_c in dic.keys():
                if dic[char_c] == w:
                    continue
                else:
                    return False
            elif char_w in dic.keys():
                if dic[char_w] == c:
                    continue
                else:
                    return False
            else:
                dic[char_c] = w
                dic[char_w] = c
                
        return True
        
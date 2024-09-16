'''
Approach: Split the the given string s. Iterate over the range of string, and add string with corresponding ith value to dictionary. Also, add pattern ith character to the dictionary. Check if the ith values of both the pattern and string are matching in the dictionary. If no match return False. If all match return true.

Time complexity: O(n) 
Space complexity:O(m) m is all characters in pattern + words in s

Passes all testcases in leetcode


'''


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s1 = s.split(" ")
        if len(s1) != len(pattern): return False
        res = {}
        for i in range(len(s1)):
            x = 'char'+ s1[i]
            y = pattern[i]
            if x not in res:
                res[x] = i
            if y not in res:
                res[y] = i
            if res[x] != res[y]: return False
        return True
        

# Given a pattern and a string str, find if str follows the same pattern. Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

# Example 1: Input: pattern = "abba", str = "dog cat cat dog" Output: true

# Example 2: Input:pattern = "abba", str = "dog cat cat fish" Output: false

# Example 3: Input: pattern = "aaaa", str = "dog cat cat dog" Output: false

# Example 4: Input: pattern = "abba", str = "dog dog dog dog" Output: false Notes: You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.

# Time: O(n)
# Spce: O(1)


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        s=s.split(" ")
        mapP={}
        mapS={}
        
        if len(pattern)!=len(s):
            return False
        
        for i in range(len(s)):
            c1=pattern[i]
            c2=s[i]
            
            if (c1 in mapP and mapP[c1]!=c2) or (c2 in mapS and mapS[c2]!=c1):
                return False
            
            mapP[c1]=c2
            mapS[c2]=c1
            
        return True
            
        
        
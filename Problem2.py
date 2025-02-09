# Problem 2 -  Isomorphic Strings
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Explain your approach in **three sentences only** at top of your code :
'''
In this method, we use two hashmaps—one for string s and one for string t. In each hashmap, the key is a character from the 
respective string, and the value is the corresponding character from the other string. For the hashmap of string s, we check 
if a character from s already exists as a key and depending on it verify whether the value associated with that key matches the 
current character from t.
'''

# Your code here along with comments explaining your approach

# Using 2 hashmap 
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        lengths = len(s)
        lengtht = len(t)
        if lengths != lengtht:
            return False
        # Created two hashmap for two string s and t
        mapS, mapT = {}, {}
        for i in range(lengths):
            # Getting the character of s and t
            charS = s[i]
            charT = t[i]
            # Checking if the char of string s at position i in hashmap of string s
            if (not (charS in mapS)):
                # if not preset then will add char of string s as key and char of string t as value
                mapS[charS] = charT
            else:
                # if preset then will check if the value of hashmap for char of string s as key and and char of string t as equal
                if (mapS[charS] != charT):
                    # if not equal then return False
                    return False
            # We will do same same thing for hashmap of string t
            if (not (charT in mapT)):
                mapT[charT] = charS
            else:
                if (mapT[charT] != charS):
                    return False
        return True

"""
Given two strings s and t, determine if they are isomorphic. Two strings are isomorphic if the characters in s can be replaced to get t. All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

Time = O(N); N = number of chaacters in s,t
Space = O(M); M = number of unique characters in s,t

Successfully executed in leetcode

Approach ---
Single index hash map/ dictionary

1. Base cases to handle when two strings have different length or same length but different unique characters.
2. Create a dictionary with key as character[i] from s and value as character[i] from t.
3. Iterate through each character in t and match with dictionary[s[i]]; if at any point characters mismatch return False
4. If we reach the end of for loop without returning False, that means we don't have mistach. So return True at the end

"""



class Isomorphic:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        if len(s) != len(t):
            return False
        
        if len(set(s)) != len(set(t)):
            return False
        
        dictionary = {}
        
        for i in range(len(s)):
            if s[i] not in dictionary:
                dictionary[s[i]] = t[i]
        
        for i in range(len(s)):
            if t[i] == dictionary[s[i]]:
                continue
            else:
                return False
        return True
        
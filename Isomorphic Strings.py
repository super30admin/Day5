Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

Example 1:

Input: s = "egg", t = "add"
Output: true

Example 2:

Input: s = "foo", t = "bar"
Output: false

Example 3:

Input: s = "paper", t = "title"
Output: true


# Time Complexity : O(N) 
# Space Complexity : O(1) 

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if (s == None and t == None) or (len(s) == 0 and len(t) == 0):
            return True 
        if (len(s) != len(t)):
            return False
        
        hashMapS = {}
        hashMapT = {}
        for i in range (len(t)):
            print(s[i],t[i])
            valueS,valueT = s[i],t[i]
            if valueS not in hashMapS: # check value of S in map else add value of S and key value as t
                hashMapS[valueS] = t[i]
            if valueT not in hashMapT:# check value of T in map else add value of T and key value as S
                hashMapT[valueT] = s[i]
            if  hashMapS[valueS]  != t[i] or hashMapT[valueT] != s[i]:#check value of S and keyvalue of T is equal
                return False
        return True
                

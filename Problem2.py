## Problem 2:
# Given two strings s and t, determine if they are isomorphic.
# Two strings are isomorphic if the characters in s can be replaced to get t.
# All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode :Yes. Executed with 240ms

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if(len(s)!=len(t)):
            return False
        mapS = {}
        setT = set()
        for i in range(len(s)):
            print(i)
            if(s[i] not in mapS):
                mapS[s[i]] = t[i]
                print("mapS",mapS)
                if(t[i] in setT):
                    return False
                else:
                    setT.add(t[i])
            else:
                if(t[i] not in setT):
                    return False
        return True
                
                
        
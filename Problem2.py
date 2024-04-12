## Problem 2:
# Given two strings s and t, determine if they are isomorphic.
# Two strings are isomorphic if the characters in s can be replaced to get t.
# All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

#Approach
# Create a hashmap and a hashset. Traverse through the string and check if the element is present in the hmap. If it is present check if the key(i.e. the char in string s) is mapped to char in string t at the same index
# if the element are mapped same, continue else return False. If the key is not present in hmap, check if the value is present in hashset that holds all the values so far. If it is, return False. 
# IF value not present in hashset, add it to hashset, add char in string s as key and char in string t as value. If you reach the end of the loop, return True


#Time Complexity: O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        if s is None and t is None:
            return False

        hmap = {}
        hset = set()

        for i in range(len(s)):
            if s[i] in hmap:
                if (hmap[s[i]] != t[i]):
                    return False
            else:
                if t[i] in hset:
                    return False
                hset.add(t[i])
                hmap[s[i]] = t[i]   
        return True
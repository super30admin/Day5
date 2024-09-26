"""
Name: Srinidhi Bhat
Time Complexity: O(n) 
Space Complexity: O(n)

Did it run on Leetcode: Yes
Logic - Maintain hashmap of {character,position} as key value
why? because position is also important - "aba" and "baa" where count is same
but they are not isomorphic because of position.
So maintain position of both the strings
"""
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if s is None or t is None:
            return False
        
        if len(s)!=len(t):
            return False
        d1={}
        d2 ={}
        for pos,val in enumerate(s):
            d1[val] = d1.get(val,[]) + [pos]
        
        for pos,val in enumerate(t):
            d2[val] = d2.get(val,[]) + [pos]
        
        return sorted(d1.values()) == sorted(d2.values())
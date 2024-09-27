# Leetcode problem link : https://leetcode.com/problems/word-pattern/
# Time Complexity : O(n) 
#  Space Complexity : O(n) -> basically 0(2n)
#  Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
'''
        Basic approach : O(n2) => check for each word in pattern and vice versa

        Optimized approach: The main idea of this problem is to create a dictionary for both the strings and check for the one to one mapping (bidirectional)
'''
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        # base condition: if sizes are not same then deifnitely not isomorphic
        if len(s) != len(t):
            return False
        # initialize the maps
        sMap = {}
        tMap = {}
        # iterate through the characters in both the strings
        for sChar,tChar in zip(s,t):
            # if char in s is not in its dictionary add it
            if sChar not in sMap:
                sMap[sChar] = tChar
            # if char in s is present in dictionary then the mapping should be the same as current character in t
            elif sMap[sChar] != tChar:
                return False
            # if char in t is not in its dictionary add it
            if tChar not in tMap:
                tMap[tChar] = sChar
            # if char in t is present in dictionary then the mapping should be the same as current character in s
            elif tMap[tChar] != sChar:
                return False
        # if code has reached here then the mapping is same hence isomorphic
        return True
        
"""

Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. 
No two characters may map to the same character, but a character may map to itself.

 
Example 1:

Input: s = "egg", t = "add"

Output: true

Example 2:

Input: s = "foo", t = "bar"

Output: false

Example 3:

Input: s = "paper", t = "title"

Output: true

Time Complexity : O(N)
Space Complexity : O(N)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

"""

# Approach: First, used a dictionary to map characters from string 's' to 't' while iterating through 's'.  
# Next, verified that each mapping remains consistent throughout the string; if any mismatch occurs, we return False.  
# Finally, ensured that the mapping is one-to-one by checking if the number of unique keys equals the number of unique values.  

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:

        d = {}

        for i in range(len(s)):
            d[s[i]] = t[i]

        for i in range(len(s)):
            if d[s[i]] != t[i]:
                return False

        d_rev = {v: k for k, v in d.items()}

        if len(d) != len(d_rev):
            return False

        return True

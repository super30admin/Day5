"""
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : No
// Any problem you faced while coding this : Yes

// Your code here along with comments explaining your approach
Algorithm Explanation
1) If the strings have different length return False
2) Iterate over both the strin using common index
    - If the char in s not in the map, update the map with s_char and value as t_char
    - If the char in s is present in the map and char in t is not equal to map[s_char] return False
3) Return true otherwise
"""
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        m = len(s)
        n = len(t)
        if m !=n:
            return False
        
        s_map = {}
        for i,j in zip(s,t):
            if not i in s_map:
                s_map[i] = j
            elif j != s_map[i]:
                return False
        return True
        
        #Alternative approach
        #return len(set(s)) == len(set(t))
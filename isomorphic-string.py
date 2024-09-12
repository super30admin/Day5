"""
Runtime Complexity:
O(n) - because we run a loop to add all the characters in s and t string to newly created hashmaps s_map and t_map.
O(n) - Space complexity because we create a new hashmap data structure and add 'n' elements to it.
Yes, the code worked on leetcode.
The idea behind the algorithm is to check if the character is present in hashmap, if not we map each character from s to t. We give a check and retrieve the value of 
element from s_map and it equals to the character in p_map then both the strings are isomorphic else not. 
"""


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False    
        s_map = {}
        t_map = {}
        for s_char,t_char in zip(s,t):
            if (s_char not in s_map) and (t_char not in t_map):
                s_map[s_char] = t_char
                t_map[t_char] = s_char
            elif s_map.get(s_char)!=t_char and t_map.get(t_char)!=s_char:
                return False
        return True
        
        
        

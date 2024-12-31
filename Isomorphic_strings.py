#Time complexity: O(n)
#Space complexity: O(1)
#Leetcode: Yes

from collections import defaultdict

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        hashmap_ST = [-1] * 256
        hashmap_TS = [-1] * 256
        
        for i, j in zip(s, t):
            if hashmap_ST[ord(i)] == -1 and hashmap_TS[ord(j)] == -1:
                hashmap_ST[ord(i)] = ord(j)
                hashmap_TS[ord(j)] = ord(i)
            elif hashmap_ST[ord(i)] != ord(j) or hashmap_TS[ord(j)] != ord(i):
                return False
        
        return True               
                

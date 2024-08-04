# // Time Complexity : O(N) where N is length of the one string.
# // Space Complexity : O(N) where N is the max of 26 characters in each hashmap.
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach
#Used two hashmap to store the first string letter as key and the another string letter as value in one hashmap and similar logic in the second hashmap with the viceversa strings letter.
#Compare the value of hashmap one with the value of second string letter and vice versa and if it doesn't math return false. Later concanate the values of any hash and compare with the other string if matches then string is Isomorphic.

from typing import List
import string
import numpy as np

class Solution:
    def init(self):
        self.Shashmap = {}
        self.Thashmap = {}
        


    def isIsomorphic(self, s: str, t: str) -> bool:
        self.Shashmap = {}
        self.Thashmap = {}
        if len(s) != len(t):
            return False
        isNotIso=True
        for i in range(len(s)):
            if s[i] not in self.Shashmap:
                self.Shashmap[s[i]] = t[i]                
            elif t[i] != self.Shashmap[s[i]]:             
                return False

            if t[i] not in self.Thashmap:
                self.Thashmap[t[i]] = s[i]
         
            elif s[i] != self.Thashmap[t[i]]: 
                return False

        isomorphic = ""
        if isNotIso == False:
            return False

        for c in s:
            if self.Shashmap[c] in self.Thashmap:
                isomorphic += self.Shashmap[c]
        if isomorphic == t:
            return True
        else:
            return False


obj = Solution()
print(obj.isIsomorphic("egg","add"))
# obj.isIsomorphic("badc", "baba")


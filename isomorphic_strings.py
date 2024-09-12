 # Time Complexity : O(n)
 # Space Complexity : O(1)
 # Did this code successfully run on Leetcode : Yes
 # Any problem you faced while coding this : None
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        hashmap_s = {}
        hashmap_t = {}
        if len(s) != len(t): # checking if length of two strings are equal
            return False

        if len(s) == len(t): # checking if length of two strings are equal
            for i in range(len(s)):
                if s[i] in hashmap_s: # checking if first letter of string s exists in hashmap_s
                    if hashmap_s[s[i]] != t[i]:
                        return False
                else:
                    hashmap_s[s[i]] = t[i] # adding key and value of s and t strings respectively to hashmap_s
                if t[i] in hashmap_t:
                    if hashmap_t[t[i]] != s[i]:
                        return False
                else:
                    hashmap_t[t[i]] = s[i] # adding key and value of t and s strings respectively to hashmap_t

            return True # strings are Isomorphic

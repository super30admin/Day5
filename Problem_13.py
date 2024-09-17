# Time Complexity : O(n) as we process through each character in s and t
# Space Complexity : O(1) # Auxiliary space is 2 * O(26) which is constant
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        h1 = {}
        h2 = {}
        if len(s)!= len(t):
            return False # If s and t have different length then they are not isomorphic
        for i in range(len(s)):
            if (s[i] in h1.keys() and h1[s[i]]!=t[i]) or (t[i] in h2.keys() and h2[t[i]]!=s[i]):
                # If the current letter in s already has a key in h1 and the value is not the corresponding 
                # letter in t then return False. Return false for the same vice versa as well
                return False
            h1[s[i]]=t[i] # Make the current letter in s as key in h1 with value as current letter in t
            h2[t[i]]=s[i] # Make the current letter in t as key in h2 with value as current letter in s
        return True # If we exit the above loop without returning False it means both are isomorphic, we return True
                

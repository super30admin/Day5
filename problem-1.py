# Time Complexity : O(n)
# Space Complexity: O(n)
# Leetcode Run: YES

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False
#         creating two hash maps to track values of s and t
        hashi={}
        hashing={}
        # since bith string are equal in length 
        # looping only one strig is enough
        for i in range(len(s)):
            # check if the character of s is in first hash map
            if s[i] in hashi:
                # check if the character is pointing to only one character
                if hashi[s[i]]!=t[i]:
                    return False
            # check if the character of t is in second hash map
            elif t[i] in hashing:
                # chcek if it is pointing to the same value it was pointing before
                if hashing[t[i]]!=s[i]:
                    return False
            else:
                # if new character is found then push its mapping into the maps
                hashi[ord(s[i])]=t[i]
                hashing[t[i]]=s[i]
        return True
                    
        
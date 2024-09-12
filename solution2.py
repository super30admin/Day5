#https://leetcode.com/problems/isomorphic-strings/

# // Time Complexity : o(n) length of the word
# // Space Complexity : o(1)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : at first, didn't realize why we have to hash for each words
#
#
# // Your code here along with comments explaining your approach
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        hm = dict()
        hm1 = dict()
        if len(s) != len(t):
            return False

        for i in range(len(s)):
            if s[i] in hm:
                if hm[s[i]] != t[i]:
                    return False
            else:
                hm[s[i]] = t[i]

        for i in range(len(s)):
            if t[i] in hm1:
                if hm1[t[i]] != s[i]:
                    return False
            else:
                hm1[t[i]] = s[i]
        return True
# Read the last question line carefully:
# "No two characters may map to the same character, but a character may map to itself."
# It talks about mapping so it should be clear that hashmap can be used.

# Leetcode Submission Successful.
class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """

        # 1 hashmap solution
        # Need to recognize if character keys are from s or t hence adding a prefix char to
        # distinguish.
        # If we don't add this prefix, won't work. E.g: for s='egga', t='addb'; a:b won't
        # get added.

        # TC = O(n)
        # SC = O(1) as ASCII characters are limited.

        # Prefix char for s: '$' and for t: '+'
        map = {}
        for i in range(len(s)):
            # Checking the condition: "No two characters may map to the same character."
            if '$' + s[i] in map:
                if map['$' + s[i]] != t[i]:
                    return False
            if '+' + t[i] in map:
                if map['+' + t[i]] != s[i]:
                    return False
            map['$' + s[i]] = t[i]
            map['+' + t[i]] = s[i]
        return True

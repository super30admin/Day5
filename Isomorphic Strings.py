class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """

        if len(s) != len(t):
            return False

        mapS = {}
        mapT = {}

        for i in range(len(s)):
            if s[i] not in mapS:
                mapS[s[i]] = t[i]

            else:

                if mapS[s[i]] != t[i]:
                    return False

            if t[i] not in mapT:
                mapT[t[i]] = s[i]

            else:
                if mapT[t[i]] != s[i]:
                    return False
        return True

        # O(n) Time Complexity | O(1) Space Complexity
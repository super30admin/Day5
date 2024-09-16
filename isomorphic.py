# Time Complexity : O(N)

# Space Complexity : O(1) since only characters allowed

# Did this code successfully run on Leetcode :
# Yes

# Any problem you faced while coding this :
# No

# Your code here along with comments explaining your approach
# I have maintained a two-way mapping by using two HashMaps.

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:

        if len(s) != len(t):
            return False

        sArray = [-1] * 100
        tArray = [-1] * 100

        for i in range(len(s)):
            indexs = ord(s[i]) - ord(' ')
            indext = ord(t[i]) - ord(' ')

            if (sArray[indexs] == -1):
                sArray[indexs] = t[i]
            elif (sArray[indexs] != t[i]):
                return False

            if (tArray[indext] == -1):
                tArray[indext] = s[i]
            elif (tArray[indext] != s[i]):
                return False

        return True
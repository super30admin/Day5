

# TC - O(n)
# SC - O(n)

# Use two arrays to store
# make two arrays of size 256, and store the ASCII value of the characters in the array
# for example while traversing the s string, first initialize everything to -1 in the s array
# if at the s[ord(s[i])] index is empty, then store ascii value of t[i]
# if at the s[ord(s[i])] index is not empty, then check the incoming ascii of t[i] and compare it with the old ascii value present in s[i]
# if its same, continue traversing, if not, then return False

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sCharArr = [-1]*256
        tCharArr = [-1]*256

        if not s:
            return False
        if not t:
            return False

        if len(s) != len(t):
            return False

        for i in range(len(s)):

            sCharValue = ord(s[i])
            tCharValue = ord(t[i])

            if sCharArr[sCharValue] != -1:
                if sCharArr[sCharValue] != tCharValue:
                    return False
            else:
                sCharArr[sCharValue] = tCharValue

            if tCharArr[tCharValue] != -1:
                if tCharArr[tCharValue] != sCharValue:
                    return False
            else:
                tCharArr[tCharValue] = sCharValue

        return True

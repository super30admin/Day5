#TC -> O(m+n) SC -> O(m) where n is length of pattern and m is len of s
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        strArray = s.split(" ") #SC -> O(n)
        if len(pattern) != len(strArray):
            return False
        charMap = {}
        strMap = {}
        for i in range(len(pattern)):
            c = pattern[i]
            st = strArray[i]
            if c in charMap:
                if charMap[c] != st:
                    return False
            else:
                charMap[c] = st
            if st in strMap:
                if strMap[st] != c:
                    return False
            else:
                strMap[st] = c
        return True
        
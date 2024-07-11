#---------------using 2 hashmaps------------
# TC O(n) and SC O(1) -> due to constant 26 alphabets
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        sMap = {}
        tMap = {}
        for i in range(len(s)):
            sChar = s[i]
            tChar = t[i]
            if sChar in sMap:
                if sMap[sChar] != tChar:
                    return False
            else:
                sMap[sChar] = tChar
                if tChar in tMap:
                    if tMap[tChar] != sChar:
                        return False
                else:
                    tMap[tChar] = sChar
        return True


#---------------using hashmap and hashset------------
# TC O(n) and SC O(1) -> due to constant 26 alphabets

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        sMap = {}
        tSet = set()
        for i in range(len(s)):
            sChar = s[i]
            tChar = t[i]
            if sChar in sMap:
                if sMap[sChar] != tChar:
                    return False
            else:
                if tChar in tSet:
                    return False
                sMap[sChar] = tChar
                tSet.add(tChar)
        return True


#---------------using 2 Lists and ASCII values for alphabets------------
# TC O(n) and SC O(1) -> due to constant 26 alphabets
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        sMap = [None] * 256
        tMap = [None] * 256
        for i in range(len(s)):
            sChar = s[i]
            tChar = t[i]
            sChar = ord(sChar) #ord function gives ASCII value
            tChar = ord(tChar)
            if sMap[sChar] != None:
                if sMap[sChar] != tChar:
                    return False
            else:
                sMap[sChar] = tChar
            if tMap[tChar] != None:
                if tMap[tChar] != sChar:
                    return False
            else:
                tMap[tChar] = sChar 
        return True



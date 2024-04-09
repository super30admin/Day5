# take 2 hashMap 
# do one to one mapping from s to t and t and s using 2 hashmaps
# if there is duplicate mapping return False
# else return True
# TimeComplexity : log(n)
# SpaceComplexity:  log(n)
# leetcode : Works well 





class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if s == None and t == None : return True
        if s == None or t == None : return False
        if len(s) != len(t) : return False
        sMap = {}
        tMap = {}
        for i in range(len(s)):
            sChar = s[i]
            tChar = t[i]
            if sChar in sMap and sMap[sChar] != tChar:
                return False
            if tChar in tMap and tMap[tChar] != sChar:
                return False
            sMap[sChar] = tChar
            tMap[tChar] = sChar
        return True

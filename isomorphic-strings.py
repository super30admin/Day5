class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        #if length is not similar, not isomorphic
        if len(s) != len(t):
            return False
        #using two dictionaries, check if the same values exist in both the dictionariies 
        dic1 = {}
        dic2 = {}
        for i in range(len(s)):
            ss = s[i]
            tt = t[i]
            if ss not in dic1:
                dic1[ss] = tt
            if tt not in dic2:
                dic2[tt] = ss
            if dic1[ss] != tt or dic2[tt] != ss:
                return False
        return True
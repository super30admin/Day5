class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        stot={}
        ttos={}
        if(len(s) != len(t)):
            return False
        for i in range(0,len(s)):
            schar = s[i]
            tchar = t[i]
            if (schar in stot and stot[schar] != tchar):
                return False
            else:
                stot[schar] = tchar
            if tchar in ttos and ttos[tchar] != schar:
                return False
            else:
                ttos[tchar] = schar
        return True
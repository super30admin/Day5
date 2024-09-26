#T(n) = O(n)
#S(n) = O(n)
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        pDict,sDict={},{}
        if len(s)!=len(t):
            return False
        for i in range(0,len(s)):
            if pDict.get(s[i],-1)==-1:
                pDict[s[i]]=t[i]
            else:
                if pDict[s[i]]!=t[i]:
                    return False
            if sDict.get(t[i],-1)==-1:   
                sDict[t[i]]=s[i]
            else:
                if sDict[t[i]]!=s[i]:
                    return False
        return True
        
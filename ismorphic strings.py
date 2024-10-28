class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        strDic = {}
        strSet = set()
        for i in range(len(s)):
            if s[i] not in strDic.keys() and t[i] not in strSet:
                strDic[s[i]] = t[i]
                strSet.add(t[i])
            else:
                if t[i] in strSet and s[i] not in strDic.keys():
                    return False
                elif strDic[s[i]] != t[i]:
                    return False
        return True  

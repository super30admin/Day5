class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        dict1 ={}
        dict2={}

        if len(s) != len(t):
            return False 
        for i in range(len(s)):
            if s[i] not in dict1:
                dict1[s[i]]=t[i]
            else:
                if t[i] != dict1[s[i]]:
                    return False
            if t[i] not in dict2:
                dict2[t[i]]=s[i]
            else:
                if s[i] != dict2[t[i]]:
                    return False
        return True
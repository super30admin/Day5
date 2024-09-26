class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False
        d={}
        s_1= set()
        for i in range(len(s)):
            if s[i] not  in d:

                if t[i]  in s_1:
                    return False
                d[s[i]]=t[i]
                s_1.add(t[i])
            else:
                if d[s[i]]!=t[i]:
                    return False
                if t[i] not in s_1  :
                    return False
                else:
                    continue
                
        
        return True
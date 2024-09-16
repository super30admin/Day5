class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        hashm = dict()
        hashm2 = dict()
        for i in range(len(s)):
            val = s[i]
            if val not in hashm.keys():
                hashm[val]=t[i]
            elif val in hashm.keys():
                if hashm[val]==t[i]:
                    continue
                else:
                    return False
        for i in range(len(t)):
            val = t[i]
            if val not in hashm2.keys():
                hashm2[val]=s[i]
            elif val in hashm2.keys():
                if hashm2[val]==s[i]:
                    continue
                else:
                    return False
        return True


        

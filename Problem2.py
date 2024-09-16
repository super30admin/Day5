class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if(len(s)!=len(t)):
            return False
        sMap={}
        tMap={}
        for i in range(len(s)):
            #this is for sMap..
            if(s[i] in sMap):
                if(sMap.get(s[i])!=t[i]):
                    return False
            else:
                sMap[s[i]]=t[i]

            #looking for two way relationship
            if(t[i] in tMap):
                if(tMap.get(t[i])!=s[i]):
                    return False
            else:
                tMap[t[i]]=s[i]

        return True

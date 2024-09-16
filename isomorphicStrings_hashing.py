class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sdict = dict()
        tdict = dict()
        if len(s)!= len(t):
            return False
        for i in range(len(s)):
            if s[i] not in sdict:
                sdict[s[i]]=t[i]
            else:
                if sdict[s[i]]!=t[i]:
                    return False
            if t[i] not in tdict:
                tdict[t[i]]=s[i]
            else:
                if tdict[t[i]]!=s[i]:
                    return False
        return True
        # slist = [0]*95
        # tlist = [0]*95
        # if len(s)!= len(t):
        #     return False
        # for i in range(len(s)):
        #     if slist[ord(s[i])-ord(' ')] ==0:
        #         slist[ord(s[i])-ord(' ')]=t[i]
        #     else:
        #         if slist[ord(s[i])-ord(' ')]!=t[i]:
        #             return False
        #     if tlist[ord(t[i])-ord(' ')] ==0:
        #         tlist[ord(t[i])-ord(' ')]=s[i]
        #     else:
        #         if tlist[ord(t[i])-ord(' ')]!=s[i]:
        #             return False
        # return True

# this implementation takes O(n) complexity where n is the length of the string
        
        
            
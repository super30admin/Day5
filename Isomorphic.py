class Solution(object):
    def isIsomorphic(self, s, t):
        dict={}
        for i in range(len(s)):
            if s[i] in dict:
                if t[i]!=dict[s[i]]:
                    return False
            else:
                if t[i] in dict.values():
                    return False
                else:
                    dict[s[i]]=t[i]
        return True
                
        

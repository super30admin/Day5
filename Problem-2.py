class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        h={}
        ind=0
        
        for i in s:
            if(i not in h):
                if(t[ind] not in h.values()):
                    h[i]=t[ind]
                else:
                    return False
            else:
                if(h[i]!=t[ind]):
                    return False
            ind+=1
        return True
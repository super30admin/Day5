class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        ind=0
        h={}
        s=list(s.split(' '))
        if(len(s)!=len(pattern)):
            return False
        for i in pattern:
            if(i not in h):
                if(s[ind] not in h.values()):
                    h[i]=s[ind]
                else:
                    return False
            else:
                if(h[i]!=s[ind]):
                    return False
           
            ind+=1
        
        return True
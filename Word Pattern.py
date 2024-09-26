class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        str1=s.split(" ")
        if(len(pattern)!=len(str1)):
            return False
        d={}
        a={}
        for i in range(len(pattern)):
            c=pattern[i]
            str2=str1[i]
            if(c in d):
                if(d[c]!=str2):
                    return False
            else:
                d[c]=str2
            if str2 in a:
                if(a[str2]!=c):
                    return False
            else:
                a[str2]=c
        return True
                   
        
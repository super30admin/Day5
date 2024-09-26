class Solution:
    def wordPattern(self, s: str, t_1: str) -> bool:
        #if len(s)!=len(t[0]):
            #return False
        sm={}
        tm={}
        t=t_1.split(' ')
        if len(s)!=len(t):
            return False
        #count_1=0
        #count_2=0
        for i in range(len(s)):
            if s[i] not in sm:
                sm[s[i]]=t[i]
            else:
                if sm[s[i]]==t[i]:
                    continue
                else:
                    return False
                    #count_1+=1
            if t[i] not in tm:
                tm[t[i]]=s[i]
            else:
                if tm[t[i]]==s[i]:
                    continue
                else:
                    return False
        return True



        '''
        d_1={}
        d_2={}
        for i in range(len(s)):
            if pattern[i] not in d_1:
                d_1[pattern[i]]=s[i]
            else:
                if d_1[pattern[i]]==s[i]:
                    continue
                else:
                    return False
            if s[i] not in d_2:
                d_2[s[i]]=pattern[i]
            else:
                if d_2[s[i]]==pattern[i]:
                    continue
                else:
                    return False
        return True
'''




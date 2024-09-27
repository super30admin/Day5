def iso(s,t):
    d1 = dict()
    d2 = dict()
    if len(s)!=len(t):
        return false
    i = 0
    while(i<len(s)):
        if s[i] not in d1:
            d1[s[i]] = t[i]
        else:
            if d1[s[i]]!=t[i]:
                return False
        if t[i] not in d2:
            d2[t[i]] = s[i]
        else:
            if d2[t[i]]!=s[i]:
                return False
        i+=1
    return True
            
    
s = ["egg","foo","paper"]
t = ["add","bar","title"]
print(iso(s[0],t[0]))
print(iso(s[1],t[1]))
print(iso(s[2],t[2]))


'''
True
False
True
'''

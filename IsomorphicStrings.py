def isIsomorphic(s, t) -> bool:
    if len(s)==1:
        return True
    else:
        tmap = {}
        smap = {}
        for i in range(len(s)):
            if s[i] in tmap:
                if tmap[s[i]] != t[i]:
                    return False
                else:
                    continue
            else:
                tmap[s[i]] = t[i]
                
            if t[i] in smap:
                if smap[t[i]] != s[i]:
                    return False
                else:
                    continue
            else:
                smap[t[i]] = s[i]
        return True
                
            
            
            
s = "egg"
t = "add"

print(isIsomorphic(s,t))
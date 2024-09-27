def isIsomorphic(s, t):


        
    if len(sorted(s)) != len(sorted(t)):
        return False
        
    sDic = {}
    tDic = {}
        
    for i in range(len(s)):
        if s[i] not in sDic :
            sDic[s[i]] = t[i]
                
        else:

            if sDic.get(s[i]) != t[i]:
                return False
                
            if t[i] not in tDic:
                tDic[t[i]] = s[i]
            
            else:
                if tDic.get(t[i]) != s[i]:
                    return False
                
    return True
        
res = isIsomorphic("abba","cddc")  

print(res)
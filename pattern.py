def wordPattern(pattern, s):

    pDic = {}
    sDic = {}
    stringList = s.split(" ")
        
    if len(pattern) != len(stringList) :
        return False
        
    for i in range(len(pattern)):
        if pattern[i] not in pDic :
            pDic[pattern[i]] = stringList[i]
                
        else:
            if pDic.get(pattern[i]) != stringList[i]:
                return False
                
        if stringList[i] not in sDic:
            sDic[stringList[i]] = pattern[i]
                
        else:
            if sDic.get(stringList[i]) != pattern[i]:
                return False
                
                
    return True

        
                 
res =  wordPattern("abba", "abc pqr pqr abc")   

print(res)
      
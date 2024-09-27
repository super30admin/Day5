def isIsomorphic(s, t):
    mem1 = {}
    mem2 = set()
    for i in range(len(s)):
        if(s[i] in mem1):
            if(mem1[s[i]] != t[i]):
                return False
        else:
            if(t[i] in mem2):
                return False
            mem1[s[i]] = t[i]
            mem2.add(t[i])
    return True

print(isIsomorphic("egg","add"))
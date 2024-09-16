def isIsomorphic(s: str, t: str) -> bool:
    my_hashMap={}
    for i in range(len(s)):
        if s[i] in my_hashMap:
            if t[i]!=my_hashMap[s[i]]:
                return False
        else:
                #check if t[i] is already present in hashmap as value
            for key in my_hashMap:
                if t[i]== my_hashMap[key]:
                    return False
            my_hashMap[s[i]]=t[i]
    return True

print(isIsomorphic("egg","add"))
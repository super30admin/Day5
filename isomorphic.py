# Time Complexity : O(N) Iterate over the input string of length N once
# Space Complexity : O(1) Max length of map and set will be 26 char's so it is constant as compared to the size of the input strings
# 205. Isomorphic Strings

def isIsomorphic(s: str, t: str) -> bool:
    if len(s) != len(t):
        return False
    sMap = {}
    tMap  = set()
    for i in range(len(s)):
        if s[i] not in sMap and t[i] not in tMap:
            sMap[s[i]] = t[i]
            tMap.add(t[i])
        elif s[i] in sMap and t[i] in tMap:
            if sMap[s[i]] != t[i]:
                return False
        else:
            return False
    return True

print(isIsomorphic("egg", "add"))
print(isIsomorphic("foo", "bar"))


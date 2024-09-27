# TC = O(n) we traverse through given each char of the strings
# SC = O(1) chars including special chars can have fixed space - 26 to 100
# Two hashmaps or 2 char arrays are used to store mappings from each string perspective. The mappings should be same to establish isomorphic pairs. 

# Method 1: Two Hashmaps method

# def checkIso(s, t):
    # if len(s) != len(t):
    #     return False
    # sMap, tMap = {}, {}
    # for i in range(len(s)):
    #     if s[i] in sMap and sMap[s[i]] != t[i]:
    #         return False
    #     else:
    #         sMap[s[i]] = t[i]
    #     if t[i] in tMap and tMap[t[i]] != s[i]:
    #         return False
    #     else:
    #         tMap[t[i]] = s[i]
    # return True

# Method 2: Two char arrays method

def checkIso(s, t):
    if len(s) != len(t):
        return False
    sMap, tMap = [None] * 100, [None] * 100
    for i in range(len(s)):
        # check if char is already mapped if mapped is it equal to the corresponding char from other string
        if sMap[ord(s[i]) - ord(' ')] != None and sMap[ord(s[i]) - ord(' ')] != t[i]:
            return False
        else:
            # do the mapping
            sMap[ord(s[i]) - ord(' ')] = t[i]
        # same process as above from the second string perspective
        if tMap[ord(t[i]) - ord(' ')] != None and tMap[ord(t[i]) - ord(' ')] != s[i]:
            return False
        else:
            tMap[ord(t[i]) - ord(' ')] = s[i]
    return True

# Using single Hashmap
# def isIsomorphic(s, t):
#         if len(s) != len(t):
#             return False 
#         d = {}
#         for i in range(len(s)):
#             if s[i] in d:
#                 if d[s[i]] != t[i]:
#                     return False 
#             elif t[i] in d.values():
#                 return False
#             d[s[i]] = t[i]
#         return True 

# Driver code
s = "egg"
t = "add"
print(checkIso(s,t))

s = "foo"
t = "bar"
print(checkIso(s,t))
        
            
# One way to solve this porblem is to maintain 2 dictionaries as taught in class and store characters from both strings
# If while iterating over both arrays, if I found a condition where the value of key does not match the current, I return false as the pattern is broken.
# Time complexirty: O(n)
# Space complexity: O(1)

def isomorphic(s1,s2):
    charDict = dict()
    charDict2 = dict()
    if (len(s1)!=len(s2)):
        return False
    for i in range(len(s1)):
        if (s1[i] in charDict):
            if (charDict[s1[i]] != s2[i]):
                return False
        else:
            charDict[s1[i]] = s2[i]
        if (s2[i] in charDict2):
            if (charDict2[s2[i]] != s1[i]):
                return False
            else:
                charDict2[s2[i]] = s1[i]
    return True


s1 = "egg"
s2 = "add"
res = isomorphic(s1,s2)
print(res)
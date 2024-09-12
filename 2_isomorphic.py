# time complexity = O(n)
# space complexity = O(1) # as hashmap will have max 26 letters only


def isomorphic(s,t):
    if len(s)!= len(t):
        return  False

    hashmap1={}
    hashmap2={}
    for i in range(len(s)):
        # create hashmap1
        try:
            if hashmap1[s[i]]:
                pass
        except KeyError:
            hashmap1[s[i]]=t[i]

        # create hashmap 2
        try:
            if hashmap2[t[i]]:
                pass
        except KeyError:
            hashmap2[t[i]] = s[i]

        # check correspondance
        if hashmap1[s[i]]!=t[i] or hashmap2[t[i]]!=s[i]:
            return False

    return True

s='abbce'
t='caatg'

print(isomorphic(s,t))



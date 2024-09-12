# time complexity = O(nk) where n is the number of words in the string and k is the average length of the words
# space complexity = O(n)

def isomorphic(s,t):
    t=t.split(' ')
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

s='abba'
t='dog cat cat dog'

print(isomorphic(s,t))



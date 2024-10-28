def wordPattern(pattern, s) -> bool:
    pmap = {}
    smap = {}
    list1 = s.split()
    if len(pattern) != len(list1):
        return False
    for i in range(len(pattern)):
        if pattern[i] in pmap and pmap[pattern[i]] != list1[i]:
            return False
        else:
            pmap[pattern[i]] = list1[i]
            
        if list1[i] in smap and smap[list1[i]] != pattern[i]:
            return False
        else:
            smap[list1[i]] = pattern[i]
            
    return True


pattern = "abba"
s = "dog dog dog dog"

print(wordPattern(pattern,s))
            
def wordPattern(pattern, s):
    mem = {}
    mem2 = set()
    s = s.split(' ')
    if(len(pattern)!=len(s)):
        return False
    for i in range(len(pattern)):
        curr = pattern[i]
        if curr in mem:
            if(mem[curr] != s[i]):
                return False
        else:
            if(s[i] in mem2):
                return False
            mem[curr] = s[i]
            mem2.add(s[i])
    return True

print(wordPattern("aaa","aa aa aa"))
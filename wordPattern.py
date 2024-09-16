def wordPattern(pattern, s):
        
        s=s.split() 
        if len(pattern)!=len(s): return False

        patternhash={}
        shash={}
        for i in range(len(pattern)):
            if pattern[i] in patternhash:
                if(patternhash[pattern[i]]!=s[i]): 
                    return False
            else:
                patternhash[pattern[i]]=s[i]
            
        for i in range(len(pattern)):
            if s[i] in shash:
                if shash[s[i]]!=pattern[i]: 
                    return False
            else:
                shash[s[i]]=pattern[i]
            
        return True

print(wordPattern("abba","dog cat cat dog"))
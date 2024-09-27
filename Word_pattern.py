def word_pattern(pattern,string):
    string = string.split()
    pattern = list(pattern)
    if len(string)!=len(pattern):
        return False
    d1 = dict()
    d2 = dict()
    i = 0
    while(i<len(pattern)):
        if pattern[i] not in d1:
            d1[pattern[i]] = string[i]
        else:
            if d1[pattern[i]]!=string[i]:
                return False
        if string[i] not in d2:
            d2[string[i]] = pattern[i]
        else:
            if d2[string[i]]!=pattern[i]:
                return False
        i +=1
    return True
    
pattern = ["abba","abba","aaaa","abba"]
string = ["dog cat cat dog","dog cat cat fish","dog cat cat dog","dog dog dog dog"]
print(word_pattern(pattern[0],string[0]))
print(word_pattern(pattern[1],string[1]))
print(word_pattern(pattern[2],string[2]))
print(word_pattern(pattern[3],string[3]))


'''
True
False
False
False
'''

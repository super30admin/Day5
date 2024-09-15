# time complexity : 0(n)
#space complexity : 2 hashmaps , only map2 occupies space which is not of connstant length 0(n)
def issamepattern(pattern, strs):
    str_arr = strs.split(' ')
    
    n = len(str_arr)
    m = len(pattern)
    
    if n == 0 and m == 0:
        return True
    if n != m:
        return False

    mymap1 = {}
    mymap2 ={}
       
    for index in range(len(pattern)):
        ch = pattern[index]
        word = str_arr[index]

        # compare from the pattern to word
        if ch not in mymap1:
            mymap1[ch] = word
        elif mymap1[ch] != word:
            return False
        
        # compare from word to pattern
        if word not in mymap2:
            mymap2[word] = ch
        elif mymap2[word] != ch:
            return False
    return True


# pattern = "abba"
# strs = "dog cat cat dog"
pattern = "abba"
strs = "dog cat cat fish"
print(issamepattern(pattern,strs))
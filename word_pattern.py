#to match the pattern with string, length of both should be equal and length of both after removing duplicates also need to be equal
#when both pattern and string are zipped, each letter from pattern str will be tupled with each word in string

def word_pattern(pattern, string):
    x = string.split(' ')
    #print(x)

    lsp = len(set(pattern))
    #print(set(pattern))

    lsx = len(set(x))
    print(set(zip(pattern, x)))

    if len(x)==len(pattern) and lsx==lsp and lsp == len(set(zip(pattern, x))):
        return True
    else:
        return False
    
pattern = "abba"
s = "dog cat cat rachel"
print(word_pattern(pattern, s))
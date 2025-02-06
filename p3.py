# using 2 hashmaps to map from t to s and vice versa, making sure each character maps uniquely. 
#If any issue is there return False else return True

def pattern(pt,s):
    words = s.split()
    if len(pt) != len(words):
        return False
    map_a={}
    map_b={}

    for p,word in zip(pt,words):
        if (p in map_a and map_a[p] != word) or (word in map_b and map_b[word] != p):
            return False
        map_a[p]= word
        map_b[word]= p
    return True

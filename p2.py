# using 2 hashmaps to map from t to s and vice versa, making sure each character maps uniquely. 
#If any issue is there return False else return True

def isomorphic(s,t):
    map_s={}
    map_t={}

    for ch_s,ch_t in zip(s,t):
        if (ch_s in map_s and map_s[ch_s] != ch_t) or (ch_t in map_t and map_t[ch_t] != ch_s):
            return False
        map_s[ch_s]= ch_t
        map_t[ch_t]= ch_s
    return True

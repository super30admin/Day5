def check_isomorphic_strings(a,b):
    s=list(a) # to convert string(word) to list of letters in python and save each character as a dict and value pairs
    p=list(b)
    if len(s) == len(p):
        dict_iso_a={} #create two has maps andcheck for the cases when a=[a,b,b,j] b=[c,d,d,d] and vice versa
        dict_iso_b={}
        for i in range(len(s)):
            if p[i] in dict_iso_b:
                if dict_iso_b[p[i]] == s[i]:
                    i=i+1
                    continue;
                else:
                    return False
            if s[i] in dict_iso_a:
                if dict_iso_a[s[i]] == p[i]:
                    i=i+1
                    continue;
                else:
                    return False

            dict_iso_a[s[i]] = p[i]
            dict_iso_b[p[i]] = s[i]
            i=i+1

        return True
    return False

m='abccddk'
n='kflliin'
print(check_isomorphic_strings(m,n))








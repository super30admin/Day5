def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
    """
    product of prime number approach

    Trade off, when have presented good computation power. If prod computations goes high.
    then this approach is good.
    
    #Time Complexity: O(K.N)
    #Space Complexity: O(K.N)
    """
    charl = {'a':2,'b':3,'c':5,'d':7,'e':11,'f':13,'g':17,'h':19,'i':23,
             'j':29,'k':31,'l':37,'m':41,'n':43,'o':47,'p':53,'q':59,'r':61,
             's':67,'t':71,'u':73,'v':79,'w':83,'x':89,'y':97,'z':101}
    hashAllChars = {}

    #base case
    if(strs == None or len(strs)==0): return []

    for i in strs:
        prod = 1
        for j in i:
            prod *= charl[j]
        if prod in hashAllChars:
            hashAllChars[prod].append(i)
        else:
            hashAllChars[prod] = [i]
    return hashAllChars.values()
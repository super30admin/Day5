class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        char_map={'a':2,'b':3,'c':5,'d':7,'e':11,'f':13,'g':17,'h':19,'i':23,
             'j':29,'k':31,'l':37,'m':41,'n':43,'o':47,'p':53,'q':59,'r':61,
             's':67,'t':71,'u':73,'v':79,'w':83,'x':89,'y':97,'z':101}
        res={}
        for i in strs:
            r=1
            for j in i:
                r*=char_map[j]
            if r in res:
                res[r].append(i)
            else:
                res[r]=[i]
        return res.values()
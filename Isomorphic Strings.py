class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s)!= len(t):
            return False

        # sMap = {}
        # tMap = {}

        # for i in range(len(s)):
        #     schar = s[i]
        #     tchar = t[i]

        #     if schar in sMap:
        #         if sMap[schar] != tchar:
        #             return False
        #     else:
        #         sMap[schar] = tchar


        #     if tchar in tMap:
        #         if tMap[tchar] != schar:
        #             return False
        #     else:
        #         tMap[tchar] = schar

        # return True    
        sMap ={}
        tset = set()

        for i in range(len(s)):
            schar = s[i]
            tchar = t[i]

            if schar in sMap:
                if sMap[schar] != tchar:
                    return False
            elif tchar in tset:
                return False        
            
            sMap[schar] = tchar
            tset.add(tchar)

        return True    



        
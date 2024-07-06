class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        sList = s.split()
        if len(sList) != len(pattern):
            return False
        print(sList[0])
        sMap ={}
        pMap = {}
        for i in range(len(sList)):
            sChar = sList[i]
            pChar = pattern[i]

            if pChar in pMap:
                if pMap[pChar] != sChar:
                    return False
            else:
                pMap[pChar] = sChar
            if sChar in sMap:
                if sMap[sChar] != pChar:
                    return False
            else: 
                sMap[sChar] = pChar
        
        return True
        

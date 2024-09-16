class Solution:
    # TC O(n)
    # SC O(1)
    def isIsomorphic(self, s: str, t: str) -> bool:
        if s is None or len(s) == 0:
            return True
        smap ={}
        tmap = {}
        for i in range(len(s)):
            sch = s[i]
            tch = t[i]
            if sch not in smap:
                smap[sch] = tch
            else:
                if(tch != smap[sch]):
                    return False
            if tch not in tmap:
                tmap[tch] = sch
            else:
                if sch != tmap[tch]:
                    return False
            
        return True
        

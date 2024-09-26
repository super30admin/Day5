'''
T.C: O(N)
S.C: O(1)

Intuition:
Have two maps, one for each string and store key value pair as char in s and char in t respectively and vice versa. 
If the previous stored value is not the same, then return false

'''
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s_len = len(s)
        t_len = len(t)
        
        if s_len != t_len:
            return False
        
        smap = dict()
        tmap = dict()
        
        for idx in range(s_len):
            sc, tc = s[idx], t[idx]
            if sc in smap:
                if smap[sc] != tc:
                    return False
            else:
                smap[sc] = tc
            
            if tc in tmap:
                if tmap[tc] != sc:
                    return False
            else:
                tmap[tc] = sc
        
        return True
        
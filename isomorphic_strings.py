class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        ## with one hashmap and one hashset
        hm = {}
        hs = set()
        
        for i in range(len(s)):
            if s[i] not in hm.keys():
                if t[i] in hs:
                    return False
                hm[s[i]] = t[i]
                hs.add(t[i])
                #print(hm, hs)
            else:
                if not hm[s[i]] == t[i]:
                    return False
        return True
        
        ## with two hashmaps
        '''
        hm1 = {}
        hm2 = {}
        
        for i in range(len(s)):
            #print(hm1, hm2)
            if s[i] not in hm1 and t[i] in hm2:
                return False
            elif s[i] in hm1 and t[i] not in hm2:
                return False
            elif s[i] in hm1 and t[i] in hm2 and (hm1[s[i]] != t[i] or hm2[t[i]] != s[i]):
                return False
            else:
                hm1[s[i]] = t[i]
                hm2[t[i]] = s[i]
        
        return True
        '''
        
        
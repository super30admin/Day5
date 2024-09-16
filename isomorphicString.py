class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        if len(s)!=len(t):
            return False
        
        sMap = dict()
        tMap = dict()
        
        for i in range(len(s)):
            
            if s[i] not in sMap:
                sMap[s[i]] = t[i]
            
            else:
                if sMap[s[i]] != t[i]:
                    return False
                               
            
            if t[i] not in tMap:
                tMap[t[i]] = s[i]
            
            else:
                if tMap[t[i]]!= s[i]:
                    return False
        
        return True
                               
                
            
                
#  time complexity is o(n)
#  Approach is create two hashmaps smap and tmap and check one two one mapping from each other in one pass!
            

            
        

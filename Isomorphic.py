# Time Complexity: O(n)
# Space Complexity: O(1)

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        smap = {}
        tset = set()
        if len(s) != len(t): return False      
        for i in range(len(s)):
            if s[i] not in smap and t[i] not in tset:  
                smap[s[i]] = t[i] 
                tset.add(t[i]) 
            elif s[i] not in smap and t[i] in tset:  
                return False
   
            elif s[i]  in smap and smap[s[i]] != t[i]: 
                return False

           
        return True

        
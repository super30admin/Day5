class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        smap = {}
        tmap = {}
        
        for i in range(len(s)):
            
            schar = s[i]
            tchar = t[i]
            
            if schar not in smap.keys():
                smap[schar] = tchar
            else:
                if smap[schar] != tchar:
                    return False
                
            if tchar not in tmap.keys():
                tmap[tchar] = schar
            else:
                if tmap[tchar] != schar:
                    return False
                
        return True
        

obj = Solution()
print(obj.isIsomorphic("egg","add"))
print(obj.isIsomorphic("foo","bar"))
print(obj.isIsomorphic("paper","title"))


# Time Complexity = O(n) where n is length of string
# Space Complexity = O(1)
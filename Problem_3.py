class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s = s.split()
        if len(pattern) != len(s):
            return False
        
        pmap = {}
        smap = {}
        
        for i in range(len(s)):
            
            pchar = pattern[i]
            schar = s[i]
            
            if pchar not in pmap.keys():
                pmap[pchar] = schar
            else:
                if pmap[pchar] != schar:
                    return False
                
            if schar not in smap.keys():
                smap[schar] = pchar
            else:
                if smap[schar] != pchar:
                    return False
                
        return True 
    
obj = Solution()
print(obj.wordPattern("abba", "dog cat cat dog"))
print(obj.wordPattern("abba", "dog cat cat fish"))
print(obj.wordPattern("aaaa", "dog cat cat dog"))
print(obj.wordPattern("abba", "dog dog dog dog"))

# Time Complexity = O(n) where n is length of string
# Space Complexity = O(1)

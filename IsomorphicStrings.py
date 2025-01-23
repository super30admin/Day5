# Time Complexity: O(n), where n is the length of the strings `s` and `t`, as we iterate through them once.
# Space Complexity: O(n), due to the two hash maps storing mappings for up to n unique characters.
# Approach: Used two hash maps to maintain character mappings from `s` to `t` and `t` to `s`, ensuring a bijective relationship.
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        smap = {}
        tmap = {}

        for i in range(len(s)):
            schar = s[i]
            tchar = t[i]

            if schar in smap: 
                if smap[schar] != tchar:
                    return False
            else: 
                smap[schar] = tchar

            if tchar in tmap:
                if tmap[tchar] != schar:
                    return False
            else:
                tmap[tchar] = schar    
        return True

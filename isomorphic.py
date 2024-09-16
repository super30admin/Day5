# Time Complexity: O(n)
# Space Complexity: O(n)

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        mapp = {}
        reverse_mapp = {}
        
        for i in range(len(s)):
            schar = s[i]
            tchar = t[i]
            if schar not in mapp.keys():
                mapp[schar] = tchar
            else:
                if mapp[schar] != tchar:
                    return False
            if tchar not in reverse_mapp.keys():
                reverse_mapp[tchar] = schar
            else:
                if reverse_mapp[tchar] != schar:
                    return False
        
        return True
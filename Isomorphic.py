# Time complexity O(n)
# Space complexity O(1) Since alphabets are limited
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        s_char = {}
        t_val = {}
        j = 0 
        for c in s:
            if c not in s_char and t[j] not in t_val:
                s_char[c] = t[j]
                t_val[t[j]] = True
            else:
                if c not in s_char or s_char[c] != t[j]:
                    return False
            j+=1
        return True
'''
ISMORPHIC STRINGS
TIME COMPLEXITY: O(N)
SPACE COMPLEXITY: O(N)
LEETCODE: yes
DIFFICULTIES: My brain took a while to figure out to use two maps.
'''
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        lm = {} # left map
        rm = {} # right map
        lm[s[0]] = 0
        rm[t[0]] = 0
        idx = 1 # unique identifier
        
        for es, et in zip(s, t):
            # Dont return false if es and et are in lm and rm respectively and both have the same value.
            if es in lm.keys() and et not in rm.keys(): 
                return False
            elif et in rm.keys() and es not in lm.keys():
                return False
            elif es in lm.keys() and et in rm.keys() and lm[es] != rm[et]:
                return False
            elif es not in lm.keys() and et not in rm.keys():
                lm[es] = idx
                rm[et] = idx
                idx += 1
        
        return True

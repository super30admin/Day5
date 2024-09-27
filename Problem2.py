#Time Complexity - O(n) 
#Space Complexity - O(n)

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        dict = {}
        set_t = set()
        for x in range(len(s)):
            if s[x] not in dict and t[x] in set_t:
                return False
            elif s[x] not in dict:
                dict[s[x]] = t[x]
                set_t.add(t[x])
            else:
                if dict[s[x]] != t[x]:
                    return False   
        
        return True
        
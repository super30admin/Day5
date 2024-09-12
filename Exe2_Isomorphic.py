
#Time Complexity - O(n) 
#Space Complexity - O(n)


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        dict_st = {}
        set_t = set()
        for x in range(len(s)):
            if s[x] in dict_st and dict_st[s[x]] != t[x]:
                return False
            elif s[x] not in dict_st and t[x] in set_t:
                return False
            else:
                if s[x] not in dict_st:
                    dict_st[s[x]] = t[x]
                    set_t.add(t[x])   

        return True